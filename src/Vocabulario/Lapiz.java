package Vocabulario;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Lapiz{
	Image personaje;
	int posx, posy;
	
	public Lapiz(){
		super();
		ImageIcon img = new ImageIcon("imagenes/lapiz (2).gif");
		personaje = img.getImage();				
		posx = 1;
		posy = 19;		
	}
	
	public Image getLapiz(){
		return personaje;
	}
	
	public int getPosx(){
		return posx;
	}
	
	public int getPosy(){
		return posy;
	}
	
	public void mover (int px, int py){
		posx += px;
		posy += py;
	}
}
