package bj.tipos.clases;

import java.awt.Insets;
import java.awt.Rectangle;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


import java.awt.Color;

public class PreferenceAction extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  JTextField txtAuth;
	private JTextField txtWorld;
	private JTextField txtGame;
	private static String authServer = ReadFile.AuthServer()!=null?ReadFile.AuthServer():"";
	private static String worldServer = ReadFile.WorldServer()!=null?ReadFile.WorldServer():"";
	private static String WoWGame = ReadFile.WoW()!=null?ReadFile.WoW():"";
	static JLabel movimiento = null;

	public PreferenceAction() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Preferencias");
		getContentPane().setLayout(null);
		
		
		//AuthServer
		JLabel lblDirectorioPelculas = new JLabel("Directorio AuthServer.exe:");
		lblDirectorioPelculas.setForeground(Color.WHITE);
		lblDirectorioPelculas.setBounds(21, 15, 164, 14);
		getContentPane().add(lblDirectorioPelculas);
		txtAuth = new JTextField();
		txtAuth.setBounds(21, 50, 350, 20);
		getContentPane().add(txtAuth);
		txtAuth.setColumns(10);
		txtAuth.setText(authServer);
		JButton btnNewButton = new JButton("PreferenceAuth");
		btnNewButton.setMargin(new Insets(2, 14, 2, 0));
		btnNewButton.setBounds(381, 48, 27, 23);
		getContentPane().add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(this.getClass().getResource("/lib/goTo.jpg")));
		btnNewButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser explorador = new JFileChooser();
		          explorador.setFileSelectionMode(JFileChooser.FILES_ONLY);
		          explorador.setDialogTitle("Abrir documento...");
		          int seleccion = explorador.showDialog(null, "Abrir!");
		          switch(seleccion) {
		          case JFileChooser.APPROVE_OPTION:
		           break;

		          case JFileChooser.CANCEL_OPTION:
		           break;

		          case JFileChooser.ERROR_OPTION:
		           break;
		          }
		          String ruta;
		          File archivo = explorador.getSelectedFile();
		          ruta = archivo.getPath();
		          txtAuth.setText(ruta);
		          authServer = ruta;
		          WriteFile.Write();
			}
		});
			
		
		
		//WorldServer
		JLabel lblDirectorioMsica = new JLabel("Directorio WorldServer.exe:");
		lblDirectorioMsica.setForeground(Color.WHITE);
		lblDirectorioMsica.setBounds(21, 115, 179, 14);
		getContentPane().add(lblDirectorioMsica);
		txtWorld = new JTextField();
		txtWorld.setColumns(10);
		txtWorld.setBounds(21, 150, 350, 20);
		getContentPane().add(txtWorld);
		txtWorld.setText(worldServer);
		JButton button = new JButton("PreferenceWorld");
		button.setMargin(new Insets(2, 14, 2, 0));
		button.setBounds(381, 148, 27, 23);
		getContentPane().add(button);
		button.setIcon(new ImageIcon(this.getClass().getResource("/lib/goTo.jpg")));
		button.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				
				JFileChooser explorador = new JFileChooser();
		          explorador.setFileSelectionMode(JFileChooser.FILES_ONLY);
		          explorador.setDialogTitle("Abrir documento...");
		          int seleccion = explorador.showDialog(null, "Abrir!");
		          switch(seleccion) {
		          case JFileChooser.APPROVE_OPTION:
		           break;

		          case JFileChooser.CANCEL_OPTION:
		           break;

		          case JFileChooser.ERROR_OPTION:
		           break;
		          }
		          String ruta;
		          File archivo = explorador.getSelectedFile();
		          ruta = archivo.getPath();
		          txtWorld.setText(ruta);
		          worldServer = ruta;
		          WriteFile.Write();
		          System.out.println(ruta);
			}
		});
		
		//WoWGame
		JLabel lblDirectorioJuegos = new JLabel("Directorio WoW.exe:");
		lblDirectorioJuegos.setForeground(Color.WHITE);
		lblDirectorioJuegos.setBounds(21, 215, 125, 14);
		getContentPane().add(lblDirectorioJuegos);
		txtGame = new JTextField();
		txtGame.setColumns(10);
		txtGame.setBounds(21, 250, 350, 20);
		getContentPane().add(txtGame);
		txtGame.setText(WoWGame);
		JButton button_1 = new JButton("PreferenceGame");
		button_1.setMargin(new Insets(2, 14, 2, 0));
		button_1.setBounds(381, 248, 27, 23);
		getContentPane().add(button_1);
		button_1.setIcon(new ImageIcon(this.getClass().getResource("/lib/goTo.jpg")));
		button_1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser explorador = new JFileChooser();
		          explorador.setFileSelectionMode(JFileChooser.FILES_ONLY);
		          explorador.setDialogTitle("Abrir documento...");
		          int seleccion = explorador.showDialog(null, "Abrir!");
		          switch(seleccion) {
		          case JFileChooser.APPROVE_OPTION:
		           break;

		          case JFileChooser.CANCEL_OPTION:
		           break;

		          case JFileChooser.ERROR_OPTION:
		           break;
		          }
		          String ruta;
		          File archivo = explorador.getSelectedFile();
		          ruta = archivo.getPath();
		          txtGame.setText(ruta);
		          WoWGame = ruta;
		          WriteFile.Write();
		          System.out.println(ruta);
			}
		});
		
		//Background
		movimiento = new JLabel();
		movimiento.setBounds(new Rectangle(0, 0, 425, 325));
		movimiento.setIcon(new ImageIcon(this.getClass().getResource("/lib/wallpaperPreferences.jpg")));
		getContentPane().add(movimiento, null);
		
	}
	
	public static String getAuthServer(){
		return authServer;
	}
	
	public static String getWorldServer(){
		return worldServer;
	}
	
	public static String getWoWGame(){
		return WoWGame;
	}

	public static void main(String[] args) {
		JFrame a = new PreferenceAction();
		a.setSize(425,325);
		a.setVisible(true);
	}
}
