package bj.tipos.clases;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Method;

import bj.tipos.clases.PreferenceAction;
import bj.tipos.clases.move;

import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Font;

public class Main extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JLabel movimiento = null;
	private static JFrame window;
	private static JFrame preferenceWindow;
	private static JButton appendButton = new JButton("append");
	
	public Main(){ 
	super();
	CreateDirectory.Create();
	setTitle("WoWServerApp");
	setResizable(false);
	getContentPane().setLayout(null);
	appendButton.setVisible(false);
	
	JLabel lblByDrgondrw = new JLabel("By Dr@gonDr3w");
	lblByDrgondrw.setFont(new Font("Calibri", Font.PLAIN, 11));
	lblByDrgondrw.setForeground(SystemColor.text);
	lblByDrgondrw.setBounds(217, 155, 83, 14);
	getContentPane().add(lblByDrgondrw);
	getContentPane().add(appendButton);
	
	//Preferences
	JButton preferenceButton = new JButton("P");
	preferenceButton.setMargin(new Insets(1, 14, 2, 1));
	preferenceButton.setBounds(268, 11, 17, 17);
	getContentPane().add(preferenceButton);
	preferenceButton.setActionCommand("preferences");
	preferenceButton.addActionListener(this);
	preferenceButton.setIcon(new ImageIcon(this.getClass().getResource("/lib/preferencesButton.jpg")));
	preferenceButton.addMouseListener(new java.awt.event.MouseAdapter() {
	public void mouseClicked(java.awt.event.MouseEvent e) {
		preferenceWindow = new PreferenceAction();
		preferenceWindow.setSize(425,325);
		preferenceWindow.setVisible(true);
			Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension ventana = preferenceWindow.getSize();
			preferenceWindow.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
			preferenceWindow.setVisible(true);
			preferenceWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
	}
});
		
	//OnButton
	JButton OnButton = new JButton("A");
	OnButton.setMargin(new Insets(2, 14, 2, 0));
	OnButton.setBounds(45, 11, 68, 70);
	getContentPane().add(OnButton);
	OnButton.setActionCommand("On");
	OnButton.addActionListener(this);
	OnButton.setIcon(new ImageIcon(this.getClass().getResource("/lib/OnButton.jpg")));
	
	//OffButton
	JButton OffButton = new JButton("W");
	OffButton.setMargin(new Insets(2, 14, 2, 0));
	OffButton.setBounds(178, 11, 68, 70);
	getContentPane().add(OffButton);
	OffButton.setActionCommand("Off");
	OffButton.addActionListener(this);
	OffButton.setIcon(new ImageIcon(this.getClass().getResource("/lib/OffButton.jpg")));
	
	//RestartButton
	JButton RestartButton = new JButton("G");
	RestartButton.setMargin(new Insets(2, 14, 2, 0));
	RestartButton.setBounds(111, 94, 68, 71);
	getContentPane().add(RestartButton);
	RestartButton.setActionCommand("games");
	RestartButton.addActionListener(this);
	RestartButton.setIcon(new ImageIcon(this.getClass().getResource("/lib/RestartButton.jpg")));
	
	//Background
	movimiento = new JLabel();
	movimiento.setBounds(new Rectangle(0, 0, 300, 200));
	movimiento.setIcon(new ImageIcon(this.getClass().getResource("/lib/wallpaperMain.jpg")));
	getContentPane().add(movimiento, null);
	} 

	public static void main (String args[])  { 
	window = new Main();
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(300,200);
	window.setVisible(true);
	Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	Dimension ventana = window.getSize();
	window.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	window.setVisible(true);
	window.getRootPane().setDefaultButton(appendButton);
	//utilizacion del awtutilies con el metodo opaque
	try {
		   @SuppressWarnings("rawtypes")
		Class clazz =  Class.forName("com.sun.awt.AWTUtilities");
		   @SuppressWarnings("unchecked")
		Method method = clazz.getMethod("setWindowOpaque", java.awt.Window.class, Boolean.TYPE);
		   method.invoke(clazz,window , false);
		   } catch (Exception e) 
		   { }	
	move mml = new move(movimiento);
	movimiento.addMouseListener(mml);
	movimiento.addMouseMotionListener(mml);
	
}

	public void actionPerformed(ActionEvent e) {
		   if ("On".equals(e.getActionCommand())) {
//			    System.out.println(s);   
				String auth = null;
				auth = PreferenceAction.getAuthServer();
				File file = new File(auth);
				try {
					Desktop.getDesktop().open(file);
					} catch(Exception e1) {
					 
					e1.printStackTrace();
					}
				String world = null;
				world = PreferenceAction.getWorldServer();
				File file1 = new File(world);
				try {
					Desktop.getDesktop().open(file1);
					} catch(Exception e1) {
					 
					e1.printStackTrace();
					}
				String game = null;
				game = PreferenceAction.getWoWGame();
				File file2 = new File(game);
				try {
					Desktop.getDesktop().open(file2);
					} catch(Exception e1) {
					 
					e1.printStackTrace();
					}
		   }
		   if ("Off".equals(e.getActionCommand())) {
			   KillProcess.cerrarAuthServer();
			   KillProcess.cerrarWorldServer();
			   KillProcess.cerrarWoW();
		   } 
		   if ("games".equals(e.getActionCommand())) {
			   KillProcess.cerrarAuthServer();
			   KillProcess.cerrarWorldServer();
				String auth = null;
				auth = PreferenceAction.getAuthServer();
				File file = new File(auth);
				try {
					Desktop.getDesktop().open(file);
					} catch(Exception e1) {
					 
					e1.printStackTrace();
					}
				String world = null;
				world = PreferenceAction.getWorldServer();
				File file1 = new File(world);
				try {
					Desktop.getDesktop().open(file1);
					} catch(Exception e1) {
					 
					e1.printStackTrace();
					}
		}
	 }
}