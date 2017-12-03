package Vocabulario;

import java.awt.Image;

import javax.swing.ImageIcon;

import java.util.*;
import java.util.Random;
import Base.Mapa;

public class Letra extends Thread {
	Image letra;
	int posx, posy;
	int n;
	public String caracter;

	public Letra(int x, int y) {
		super();
	}

	public void crearResp(int x, int y, int n) {
		this.n = n;
		if (n == 0) {
			ImageIcon imagen = new ImageIcon("imagenes\\a.png");
			letra = imagen.getImage();
			caracter = "a";
		} else if (n == 1) {
			ImageIcon imagen = new ImageIcon("imagenes\\b.png");
			letra = imagen.getImage();
			caracter = "b";
		} else if (n == 2) {
			ImageIcon imagen = new ImageIcon("imagenes\\c.png");
			letra = imagen.getImage();
			caracter = "c";
		} else if (n == 3) {
			ImageIcon imagen = new ImageIcon("imagenes\\d.png");
			letra = imagen.getImage();
		} else if (n == 4) {
			ImageIcon imagen = new ImageIcon("imagenes\\e.png");
			letra = imagen.getImage();
		} else if (n == 5) {
			ImageIcon imagen = new ImageIcon("imagenes\\f.png");
			letra = imagen.getImage();
		} else if (n == 6) {
			ImageIcon imagen = new ImageIcon("imagenes\\g.png");
			letra = imagen.getImage();
		} else if (n == 7) {
			ImageIcon imagen = new ImageIcon("imagenes\\h.png");
			letra = imagen.getImage();
		} else if (n == 8) {
			ImageIcon imagen = new ImageIcon("imagenes\\i.png");
			letra = imagen.getImage();
		} else if (n == 9) {
			ImageIcon imagen = new ImageIcon("imagenes\\j.png");
			letra = imagen.getImage();
		} else if (n == 10) {
			ImageIcon imagen = new ImageIcon("imagenes\\k.png");
			letra = imagen.getImage();
		} else if (n == 11) {
			ImageIcon imagen = new ImageIcon("imagenes\\l.png");
			letra = imagen.getImage();
		} else if (n == 12) {
			ImageIcon imagen = new ImageIcon("imagenes\\m.png");
			letra = imagen.getImage();
		} else if (n == 13) {
			ImageIcon imagen = new ImageIcon("imagenes\\n.png");
			letra = imagen.getImage();
		} else if (n == 14) {
			ImageIcon imagen = new ImageIcon("imagenes\\ñ.png");
			letra = imagen.getImage();
		} else if (n == 15) {
			ImageIcon imagen = new ImageIcon("imagenes\\o.png");
			letra = imagen.getImage();
		} else if (n == 16) {
			ImageIcon imagen = new ImageIcon("imagenes\\p.png");
			letra = imagen.getImage();
		} else if (n == 17) {
			ImageIcon imagen = new ImageIcon("imagenes\\q.png");
			letra = imagen.getImage();
		} else if (n == 18) {
			ImageIcon imagen = new ImageIcon("imagenes\\r.png");
			letra = imagen.getImage();
		} else if (n == 19) {
			ImageIcon imagen = new ImageIcon("imagenes\\s.png");
			letra = imagen.getImage();
		} else if (n == 20) {
			ImageIcon imagen = new ImageIcon("imagenes\\t.png");
			letra = imagen.getImage();
		} else if (n == 21) {
			ImageIcon imagen = new ImageIcon("imagenes\\u.png");
			letra = imagen.getImage();
		} else if (n == 22) {
			ImageIcon imagen = new ImageIcon("imagenes\\v.png");
			letra = imagen.getImage();
		} else if (n == 23) {
			ImageIcon imagen = new ImageIcon("imagenes\\w.png");
			letra = imagen.getImage();
		} else if (n == 24) {
			ImageIcon imagen = new ImageIcon("imagenes\\x.png");
			letra = imagen.getImage();
		} else if (n == 25) {
			ImageIcon imagen = new ImageIcon("imagenes\\y.png");
			letra = imagen.getImage();
		} else {
			ImageIcon imagen = new ImageIcon("imagenes\\z.png");
			letra = imagen.getImage();

		}
		setPosx(x);
		setPosy(y);
	}

	public void crearRandom(int x, int y, int n) {
		this.n = n;
		if (n == 0) {
			ImageIcon imagen = new ImageIcon("imagenes\\a.png");
			letra = imagen.getImage();
			caracter = "a";
		} else if (n == 1) {
			ImageIcon imagen = new ImageIcon("imagenes\\b.png");
			letra = imagen.getImage();

		} else if (n == 2) {
			ImageIcon imagen = new ImageIcon("imagenes\\c.png");
			letra = imagen.getImage();

		} else if (n == 3) {
			ImageIcon imagen = new ImageIcon("imagenes\\d.png");
			letra = imagen.getImage();
		} else if (n == 4) {
			ImageIcon imagen = new ImageIcon("imagenes\\e.png");
			letra = imagen.getImage();
		} else if (n == 5) {
			ImageIcon imagen = new ImageIcon("imagenes\\f.png");
			letra = imagen.getImage();
		} else if (n == 6) {
			ImageIcon imagen = new ImageIcon("imagenes\\g.png");
			letra = imagen.getImage();
		} else if (n == 7) {
			ImageIcon imagen = new ImageIcon("imagenes\\h.png");
			letra = imagen.getImage();
		} else if (n == 8) {
			ImageIcon imagen = new ImageIcon("imagenes\\i.png");
			letra = imagen.getImage();
		} else if (n == 9) {
			ImageIcon imagen = new ImageIcon("imagenes\\j.png");
			letra = imagen.getImage();
		} else if (n == 10) {
			ImageIcon imagen = new ImageIcon("imagenes\\k.png");
			letra = imagen.getImage();
		} else if (n == 11) {
			ImageIcon imagen = new ImageIcon("imagenes\\l.png");
			letra = imagen.getImage();
		} else if (n == 12) {
			ImageIcon imagen = new ImageIcon("imagenes\\m.png");
			letra = imagen.getImage();
		} else if (n == 13) {
			ImageIcon imagen = new ImageIcon("imagenes\\n.png");
			letra = imagen.getImage();
		} else if (n == 14) {
			ImageIcon imagen = new ImageIcon("imagenes\\ñ.png");
			letra = imagen.getImage();
		} else if (n == 15) {
			ImageIcon imagen = new ImageIcon("imagenes\\o.png");
			letra = imagen.getImage();
		} else if (n == 16) {
			ImageIcon imagen = new ImageIcon("imagenes\\p.png");
			letra = imagen.getImage();
		} else if (n == 17) {
			ImageIcon imagen = new ImageIcon("imagenes\\q.png");
			letra = imagen.getImage();
		} else if (n == 18) {
			ImageIcon imagen = new ImageIcon("imagenes\\r.png");
			letra = imagen.getImage();
		} else if (n == 19) {
			ImageIcon imagen = new ImageIcon("imagenes\\s.png");
			letra = imagen.getImage();
		} else if (n == 20) {
			ImageIcon imagen = new ImageIcon("imagenes\\t.png");
			letra = imagen.getImage();
		} else if (n == 21) {
			ImageIcon imagen = new ImageIcon("imagenes\\u.png");
			letra = imagen.getImage();
		} else if (n == 22) {
			ImageIcon imagen = new ImageIcon("imagenes\\v.png");
			letra = imagen.getImage();
		} else if (n == 23) {
			ImageIcon imagen = new ImageIcon("imagenes\\w.png");
			letra = imagen.getImage();
		} else if (n == 24) {
			ImageIcon imagen = new ImageIcon("imagenes\\x.png");
			letra = imagen.getImage();
		} else if (n == 25) {
			ImageIcon imagen = new ImageIcon("imagenes\\y.png");
			letra = imagen.getImage();
		} else {
			ImageIcon imagen = new ImageIcon("imagenes\\z.png");
			letra = imagen.getImage();

		}
		setPosx(x);
		setPosy(y);
	}

	public Image getLetra() {
		return letra;
	}

	public void setPosx(int x) {
		posx = x;
	}

	public void setPosy(int y) {
		posy = y;
	}

	public int getPosx() {
		return posx;
	}

	public int getPosy() {
		return posy;
	}

	public int getN() {
		return n;
	}

	public void run() {

		while (true) {
			try {
				sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			posy = posy + 1;

		}
	}

}
