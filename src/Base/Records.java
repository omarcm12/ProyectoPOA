package Base;

import java.io.*;

import javax.swing.*;
import Vocabulario.Jugador;


public class Records{
	public static float tiempoAux;
	public static int nivelAux;
	
	
	public  static void comparar(Jugador ju1) {
		int i=0;
		String j,j1,j2;
		String Jugadores[] = new String[10];
		
		if(ju1.getPuntuacion() < 10){
			j = ju1.getNombre() + " 0" + Integer.toString(ju1.getPuntuacion()) + " " + Float.toString(ju1.getTiempoFinal());
		}
		else{
			j = ju1.getNombre() + " " + Integer.toString(ju1.getPuntuacion()) + " " + Float.toString(ju1.getTiempoFinal());
		}
		
		leer(Jugadores); 
		
		while(i < 10){
			nivelAux = Integer.parseInt(Jugadores[i].substring(4,6));//el nivel se guardo apartir de las posicion 4 a la 6
			tiempoAux = Float.parseFloat(Jugadores[i].substring(7).trim());//el tiempo se guardo apartir de las posicion 7			
			
			if(  (ju1.getPuntuacion() > nivelAux ) || ( ( ju1.getPuntuacion() == nivelAux ) && (ju1.getTiempoFinal() > tiempoAux ) ) ){
				j1 = Jugadores[i];
				Jugadores[i] = j;

				for(int k = i + 1; k < 10; k++){
					j2 = Jugadores[k];
					Jugadores[k] = j1;
					j1= j2;
				}
				i = 10;
			}
			else{
				i++;
			}
		}

		reescribir(Jugadores);
	
	}
	
	
	public  static void reescribir(String Jugadores[]){
		FileWriter archivo = null;
		PrintWriter pw = null;
			try{
				archivo = new FileWriter("Mejores Records.txt");
				pw = new PrintWriter(archivo);
				for (int i = 0; i<10 ; i++)
					pw.println(Jugadores[i]);
			} catch (Exception e) {
				e.printStackTrace();
			} finally { 			
				try {
					if (null != archivo)
						archivo.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}	
	}
	
	
	public  static void leer(String Jugadores[]){
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		int i=0;
			try {			
				archivo = new File ("Mejores Records.txt");
				fr = new FileReader (archivo);
				br = new BufferedReader(fr);
					for(i=0;i<10;i++)		
						Jugadores[i] = br.readLine();							
			}
			catch(Exception e){
				for(i=0;i<10;i++)						
					Jugadores[i] = "aaa 00 0.0";
			}
			finally{
				try{
					if( null != fr ){
						fr.close();
					}
				}catch (Exception e2){
					e2.printStackTrace();
					
				}
			}							
	}
	
	
	public static void mostrar(){
		String Jugadores[] = new String[10];
		String records;
		int i;
		
		leer(Jugadores);
		records = "Lugar\tNombre\tPuntuacion\tTiempo\n";
		for(i=0;i<10;i++)
			records += ""+(i+1)+"\t"+Jugadores[i].substring(0,3)+"\t"+Jugadores[i].substring(4,6)+"\t"+Jugadores[i].substring(7).trim()+"\n";
		
		JTextArea areaTexto = new JTextArea();
		
		areaTexto.setText(records);
	
		JOptionPane.showMessageDialog( null , areaTexto, "Los Mejores" , JOptionPane.INFORMATION_MESSAGE );
	}
}

