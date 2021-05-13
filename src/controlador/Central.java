package controlador;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.Infousu;
import modelo.Usuarios;

public class Central {
	
	
	public void verTodos() {
		
		ArrayList<Infousu> usuarios = new Usuarios().recogerTodosUsuarios();
		 
		new Vistas.Tabla(usuarios);
	}
	
}