package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Infousu;
import beans.Arma;

public class Usuarios {
	
	public Usuarios(ArrayList<Usuarios> usuarios, String contraseņa, String us) {}

	public Usuarios() {} 
	
	public Usuarios(String usuario, String contraseņa) {}

	public void insertarUsuario( String nombre, String contraseņa) {
		
		String usuario = nombre;
		String Contraseņa = contraseņa;

		conexion.EjecutarUpdate("INSERT INTO infousu (nombre) VALUES ('"+nombre+"');");
	}
	
	public Infousu recogerUsuarios(String usuario, String contraseņa) {
		ResultSet resultado = conexion.EjecutarSentencia("select * from infousu where usuario='"+usuario+"' and contraseņa='"+contraseņa+"';");
		try {
			if(resultado.next()) {
		
				String Usuario = resultado.getString("usuario");
				String Contraseņa = resultado.getString("contraseņa");
				Infousu infousuRecogido = new Infousu (usuario, contraseņa);
				return infousuRecogido;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList<Infousu> recogerTodosUsuarios(){
		ArrayList<Infousu> infousu = new ArrayList<Infousu>();
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM infousu;");
		try {
			while(resultado.next()) {
				int id = resultado.getInt("id");
				String nombre = resultado.getString("nombre");
				String contraseņa = resultado.getString("contraseņa");
				infousu.add(new Infousu(nombre, contraseņa));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infousu;
	}


}
