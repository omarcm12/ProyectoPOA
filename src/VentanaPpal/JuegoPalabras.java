package VentanaPpal;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import Base.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;






import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class JuegoPalabras{

	private JFrame frame;
	private JMenuBar menuBar; 
	private JMenuItem menu;
	private JMenuItem records;
	JPanel contenedor = new JPanel();
	JPanel menuP = new JPanel();
	Juego juego = new Juego();
	CardLayout cl = new CardLayout();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoPalabras window = new JuegoPalabras();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JuegoPalabras() {
		menuPrincipal();
		initialize();
	}

	
	private void menuPrincipal(){
		
		
		menuP = new JPanel();
		menuP.setLayout(null);
		
		ImageIcon imagenFondo; 
        				 
		imagenFondo = new ImageIcon("imagenes/fondo.PNG");		 
	    imagenFondo = new ImageIcon(imagenFondo.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT));
	    
	    JButton btnJugar = new JButton("Jugar");
	    btnJugar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		juego.iniciarJuego();
	    		cl.show(contenedor, "2");
	    	}
	    });
	    btnJugar.setBounds(350, 170, 100, 50);
	    btnJugar.setVisible(true);
	    menuP.add(btnJugar);
	    
	    JButton btnRecords = new JButton("Records");
	    btnRecords.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Records.mostrar();
	    	}
	    });
	    btnRecords.setBounds(350, 230, 100, 50);
	    btnRecords.setVisible(true);
	    menuP.add(btnRecords);
	    
	    JButton btnSalir = new JButton("Salir");
	    btnSalir.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.exit(0);
	    	}
	    });
	    btnSalir.setBounds(350, 290, 100, 50);
	    btnSalir.setVisible(true);
	    menuP.add(btnSalir);
	    
	    JLabel fondo = new JLabel(" ");
	    fondo.setSize(1000,700); 
	    fondo.setLocation(0,0); 
	    fondo.setVisible(true);  
	    fondo.setIcon(imagenFondo);
	    menuP.add(fondo);
		
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1000,730);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		menu = new JMenuItem("Menu");
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if(juego.getBandera())
					juego.terminarJuego();
				cl.show(contenedor, "1");
			}
		});
		menuBar.add(menu);
		
		records = new JMenuItem("Records");
		records.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Records.mostrar();
			}
		});
		
		menuBar.add(records);
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		menuBar.add(button);
		
		
		frame.getContentPane().add(contenedor, BorderLayout.CENTER);
		contenedor.setLayout(cl);
		contenedor.add(menuP, "1");
		contenedor.add(juego, "2"); 
		cl.show(contenedor, "1");
		
	}
}