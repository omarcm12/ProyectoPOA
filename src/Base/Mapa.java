package Base;

import java.awt.*;

import javax.swing.ImageIcon;

import java.util.Vector;

import Vocabulario.*;

public class Mapa {
	private Image suelo, cielo, nube;
	public int nivel = 5;
	public String mapa[] = new String[21];
	private Vector<Letra> letras = new Vector<Letra>();
	//mapa
	public Mapa(){
		ImageIcon imagen = new ImageIcon("imagenes/cielo.png");
		cielo = imagen.getImage();
		imagen = new ImageIcon("imagenes/tierra.png");
		suelo = imagen.getImage();
		imagen = new ImageIcon("imagenes/nubes.png");
		nube = imagen.getImage();
		
		mapa[0] = "nnnnnnnnnnnnnnnnnnnnnnnnn";
		mapa[1] = "ccccccccccccccccccccccccc";
		mapa[2] = "ccccccncccccccccccccccccc";
		mapa[3] = "ccccnccccccccccccccccnccc";
		mapa[4] = "ccccccccccccncccccccccccc";
		mapa[5] = "ccccccccccccccccccccccccc";
		mapa[6] = "cccccccncccccccccccnccccc";
		mapa[7] = "ccccccccccccccccccccccccc";
		mapa[8] = "ccccccccccccccccccccccccc";
		mapa[9] = "ccccccccccccccccccccccccc";
		mapa[10] = "ccccccccccccccccccccccccc";
		mapa[11] = "ccccccccccccccccccccccccc";
		mapa[12] = "ccccccccccccccccccccccccc";
		mapa[13] = "ccccccccccccccccccccccccc";
		mapa[14] = "ccccccccccccccccccccccccc";
		mapa[15] = "ccccccccccccccccccccccccc";
		mapa[16] = "ccccccccccccccccccccccccc";
		mapa[17] = "ccccccccccccccccccccccccc";
		mapa[18] = "ccccccccccccccccccccccccc";
		mapa[19] = "ccccccccccccccccccccccccc";
		mapa[20] = "sssssssssssssssssssssssss";
		
	}
	
	public Vector<Letra> getLetras() {
		return letras;
	}

	public void setLetras(Vector<Letra> letras) {
		this.letras = letras;
	}
	
	public String getCMapa(int y){
		return mapa[y];
	}
	
	public String getMapa(int x, int y){
		String elemento = mapa[y].substring(x, x + 1);
		return elemento;
		
	}
	
	public Image getCielo(){
		return cielo;
	}
	
	public Image getSuelo(){
		return suelo;
	}
	
	public Image getNube(){
		return nube;
	}
}

