package Vocabulario;

import javax.swing.JOptionPane;

public class Jugador { 
	String nombre;
	float tiempo;
	int puntuacion;
	
	
	public Jugador(){
	
	}
	
	public void setNombre(){
		do{
			nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre de jugador(3 caracteres) o 'no' para no guardar: ").trim();
			if(nombre.equals("no"))
				nombre = "noo";
		}while(nombre.length() != 3);
	}	
	
	public void setTiempoFinal(String t){
		tiempo= Float.parseFloat(t);
	}
	
	public void setPuntuacion(int punt){
		puntuacion = punt;
	}

	public float getTiempoFinal(){
		return tiempo;
	}	
	
	public int getPuntuacion(){
		return puntuacion;
	}

	public String getNombre(){
		return nombre;
	}	

}