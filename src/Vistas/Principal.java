package Vistas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import beans.Infousu;
import modelo.Usuarios;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField usuarioField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 444);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
	
				JPanel panel = new JPanel();
				panel.setBounds(75, 62, 424, 269);
				contentPane.add(panel);
				panel.setLayout(null);
				
				passwordField = new JPasswordField();
				passwordField.setBounds(10, 179, 152, 26);
				panel.add(passwordField);
				
				JLabel lblNewLabel = new JLabel("Usuario");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 20));
				lblNewLabel.setBounds(10, 36, 124, 36);
				panel.add(lblNewLabel);
				
				JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
				lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_2.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 20));
				lblNewLabel_2.setBounds(10, 135, 124, 36);
				panel.add(lblNewLabel_2);
				
				
					JLabel lblNewLabel_1 = new JLabel("    Login ");
					lblNewLabel_1.setBounds(235, 22, 152, 58);
					panel.add(lblNewLabel_1);
					lblNewLabel_1.setFont(new Font("Sitka Display", Font.BOLD, 22));
					lblNewLabel_1.setForeground(new Color(0, 0, 0));
					lblNewLabel_1.setLabelFor(panel);
					lblNewLabel_1.setBackground(SystemColor.activeCaption);
					
					JButton btnNewButton_1 = new JButton("Intro");
					btnNewButton_1.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 17));
					btnNewButton_1.setBackground(Color.BLACK);
					btnNewButton_1.setBounds(282, 179, 105, 36);
					panel.add(btnNewButton_1);
					
					usuarioField = new JTextField();
					usuarioField.setBounds(10, 91, 152, 26);
					panel.add(usuarioField);
					usuarioField.setColumns(10);
					
					JLabel Fondo = new JLabel("");
					Fondo.setBounds(0, 0, 583, 415);
					contentPane.add(Fondo);
					Fondo.setBackground(new Color(128, 128, 128));
					Fondo.setToolTipText("");
					Fondo.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\ProyectoEclipse\\Proyecto\\Imag\\Fondoatras.png"));
					Fondo.setLabelFor(panel);
					
					JLabel fondologin = new JLabel("");
					fondologin.setIcon(new ImageIcon("C:\\Proyecto\\ADAITS\\Programaci\u00F3n\\ProyectoEclipse\\Proyecto\\Imag\\fodnologin.jpg"));
					fondologin.setBounds(0, 0, 424, 269);
					panel.add(fondologin);
					
					new Usuarios(null, usuarioField.getText(),passwordField.getText() ).recogerUsuarios(usuarioField.getText(),passwordField.getText());
	}
}
