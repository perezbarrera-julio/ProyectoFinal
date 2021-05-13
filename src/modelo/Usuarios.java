package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Infousu;
import beans.Arma;

public class Usuarios {
	
	public Usuarios(ArrayList<Usuarios> usuarios, String contrase�a, String us) {}

	public Usuarios() {} 
	
	public Usuarios(String usuario, String contrase�a) {}

	public void insertarUsuario( String nombre, String contrase�a) {
		
		String usuario = nombre;
		String Contrase�a = contrase�a;

		conexion.EjecutarUpdate("INSERT INTO infousu (nombre) VALUES ('"+nombre+"');");
	}
	
	public Infousu recogerUsuarios(String usuario, String contrase�a) {
		ResultSet resultado = conexion.EjecutarSentencia("select * from infousu where usuario='"+usuario+"' and contrase�a='"+contrase�a+"';");
		try {
			if(resultado.next()) {
		
				String Usuario = resultado.getString("usuario");
				String Contrase�a = resultado.getString("contrase�a");
				Infousu infousuRecogido = new Infousu (usuario, contrase�a);
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
				String contrase�a = resultado.getString("contrase�a");
				infousu.add(new Infousu(nombre, contrase�a));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infousu;
	}


}
