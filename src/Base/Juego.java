package Base;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import Vocabulario.*;
import javax.swing.*;

import org.omg.CORBA.Environment;

import VentanaPpal.JuegoPalabras;

public class Juego extends JPanel implements ActionListener {
	private Image i;
	public Timer timer;
	public Mapa m;
	public Lapiz lapiz; // lapiz
	Random pos = new Random();
	public int puntuacion = 1;
	int a, n;
	public double cronometro = 0;
	public String tiempoFinal;
	public Jugador jugador1;
	boolean terminar = false, bandera = true;
	public Palabras palabra;
	int x = 1, xx = 0;
	int[] respuestas = { 8, 4, 4, 19, 0, 15, 8, 13, 11, 21, 0, 20, 8 };
	int[] idLetras = new int[12];


	public Juego() {
		m = new Mapa();
		lapiz = new Lapiz();
		palabra = new Palabras();
		setFocusable(true);
		timer = new Timer(25, this);
	}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);

		for (int x = 0; x < 25; x++) { // pinta el mapa
			for (int y = 0; y < 21; y++) {

				if (m.getMapa(x, y).equals("s")) {
					g.drawImage(m.getSuelo(), x * 32, y * 32, null);
				} else if (m.getMapa(x, y).equals("c")) {
					g.drawImage(m.getCielo(), x * 32, y * 32, null);
				} else if (m.getMapa(x, y).equals("n")) {
					g.drawImage(m.getNube(), x * 32, y * 32, null);
				}

			}
		}

		for (int j = 0; j < m.getLetras().size(); j++) { // recorre vector de
															// letras
			g.drawImage(m.getLetras().get(j).getLetra(), m.getLetras().get(j).getPosx() * 32,
					m.getLetras().get(j).getPosy() * 32, null);// se dibuja la
																// letra
		}

		g.drawImage(lapiz.getLapiz(), lapiz.getPosx() * 32, lapiz.getPosy() * 32, null); // dibuja
																							// el
																							// lapiz

		cronometro++;
		tiempoFinal = Double.toString(cronometro / 40);
		Font font = new Font("Arial", 1, 20);
		Font font2 = new Font("Cookies", 1, 25);
		g.setColor(Color.BLACK);
		g.setFont(font);
		g.drawString("COMPLETA:", 820, 100);
		g.drawString("LA PALABRA", 820, 130);

		g.setColor(Color.blue);
		g.setFont(font2);
		if (xx == 0) {
			g.drawString(palabra.gallina, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\gallina.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);

		} else if (xx == 1) {
			g.drawString(palabra.perro, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\perro.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);

		} else if (xx == 2) {
			g.drawString(palabra.pelota, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\pelota.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 3) {
			g.drawString(palabra.television, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\tv.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 4) {
			g.drawString(palabra.carro, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\carro.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 5) {
			g.drawString(palabra.gato, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\gato.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 6) {
			g.drawString(palabra.pizarron, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\pizzarron.jpg");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 7) {
			g.drawString(palabra.llanta, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\llanta.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 8) {
			g.drawString(palabra.bolsa, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\bolsa.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 9) {
			g.drawString(palabra.luna, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\luna.jpg");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 10) {
			g.drawString(palabra.pizza, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\pizza.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 11) {
			g.drawString(palabra.lentes, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\lentes.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		} else if (xx == 12) {
			g.drawString(palabra.lluvia, 820, 200);
			ImageIcon img = new ImageIcon("imagenes\\lluvia.png");
			Image i = img.getImage();
			g.drawImage(i, 820, 200, null);
		}

		if (cronometro % 100 == 0) // cada 5 segundos crea una letra
		{
			a = pos.nextInt(23) + 1;
			n = pos.nextInt(26);
			Letra letra = new Letra(a, 0);
			letra.crearRandom(a, 0, n);
			letra.start();
			m.getLetras().add(letra);

		}

		if (cronometro % 200 == 0) // cada 10 segundos crea la letra respuesta
		{
			a = pos.nextInt(23) + 1;
			Letra letra = new Letra(a, 0);
			letra.crearResp(a, 0, respuestas[xx]);
			letra.start();
			m.getLetras().add(letra);

		}

	}

	public class Al extends KeyAdapter { // mover al jugador

		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();

			if (keycode == KeyEvent.VK_UP)
				if (!m.getMapa(lapiz.getPosx(), lapiz.getPosy() - 1).equals("s")
						&& !m.getMapa(lapiz.getPosx(), lapiz.getPosy() - 1).equals("n"))
					lapiz.mover(0, -1);

			if (keycode == KeyEvent.VK_DOWN)
				if (!m.getMapa(lapiz.getPosx(), lapiz.getPosy() + 1).equals("s")
						&& !m.getMapa(lapiz.getPosx(), lapiz.getPosy() + 1).equals("n"))
					lapiz.mover(0, 1);

			if (keycode == KeyEvent.VK_LEFT)
				if (!m.getMapa(lapiz.getPosx() - 1, lapiz.getPosy()).equals("s")
						&& !m.getMapa(lapiz.getPosx() - 1, lapiz.getPosy()).equals("n"))
					lapiz.mover(-1, 0);

			if (keycode == KeyEvent.VK_RIGHT)
				if (!m.getMapa(lapiz.getPosx() + 1, lapiz.getPosy()).equals("s")
						&& !m.getMapa(lapiz.getPosx() + 1, lapiz.getPosy()).equals("n"))
					lapiz.mover(1, 0);

			for (int i = 0; i < m.getLetras().size(); i++) {// recorre todo el
															// vector de letras
				if (lapiz.getPosx() == m.getLetras().get(i).getPosx()
						&& lapiz.getPosy() == m.getLetras().get(i).getPosy()) // compara
																				// posicion
																				// del
																				// lapiz
																				// con
																				// la
																				// letra
																				// de
																				// la
																				// posicion
																				// j
				{
					// queLetraEs(i); // comprueba que letra tomo
					idLetras[xx] = m.getLetras().get(i).getN();
					if (respuestas[xx] == idLetras[xx]) {
						puntuacion = puntuacion + 5;
					}

					m.getLetras().remove(i);// si las posiciones son iguales se
											// elemina la letra
					xx++; // para cambiar la letra incompleta que muestra en
							// pantalla
					if (xx == 12) {

						terminarJuego();

					}
				}
			}

		}

		public void keyReleased(KeyEvent e) {
		}
	}

	public void iniciarJuego() {
		int i = 0;
		terminar = false;
		bandera = true;
		addKeyListener(new Al());
		puntuacion = 1;

		while (i < 3) { // crea 3 letras al inicio
			a = pos.nextInt(23) + 1;
			n = pos.nextInt(26);
			Letra letra = new Letra(a, 0);
			letra.crearRandom(a, 0, n);
			letra.start();
			m.getLetras().add(letra);
			i++;
		}
		i = 0;
		timer = new Timer(25, this);
		timer.start();

	}

	public boolean getBandera() {
		return bandera;
	}

	public void terminarJuego() {
		timer.stop();
		Jugador jugador1 = new Jugador();
		jugador1.setNombre();
		jugador1.setTiempoFinal(tiempoFinal);
		jugador1.setPuntuacion(puntuacion);
		terminar = true;
		m.getLetras().clear();
		cronometro = 0;
		if (!jugador1.getNombre().equals("noo")) {
			Records.comparar(jugador1);

		}
		JuegoPalabras juego1 = new JuegoPalabras(); // reinicia todo
	}

	public void queLetraEs(int i) {
		if (m.getLetras().get(i).getN() == 0) {
			System.out.println("agarro a");
		} else if (m.getLetras().get(i).getN() == 1) {
			System.out.println("agarro b");
		} else if (m.getLetras().get(i).getN() == 2) {
			System.out.println("agarro c");
		} else if (m.getLetras().get(i).getN() == 3) {
			System.out.println("agarro d");
		} else if (m.getLetras().get(i).getN() == 4) {
			System.out.println("agarro e");
		} else if (m.getLetras().get(i).getN() == 5) {
			System.out.println("agarro f");
		} else {
			System.out.println("agarro g");
		}

	}

}