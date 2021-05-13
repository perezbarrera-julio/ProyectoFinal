package Vistas;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Usuarios;
import beans.Infousu;

public class Tabla extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public Tabla(ArrayList<Infousu> infousus) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
	
		dtm.addColumn("ID");
		dtm.addColumn("Nombre");
		dtm.addColumn("Contraseñas");
		
		for(Infousu infousu : infousus) {
			Object[] fila = new Object[3];
			fila[0] = infousu.getID();
			fila[1] = infousu.getUsuario();
			fila[2] = infousu.getContraseña();
			dtm.addRow(fila);			
		}
		
		
		setVisible(true);
	}

}
