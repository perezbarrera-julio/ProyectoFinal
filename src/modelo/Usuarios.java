package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Infousu;
import beans.Arma;

public class Usuarios {
	
	public Usuarios(ArrayList<Usuarios> usuarios, String contraseña, String us) {}

	public Usuarios() {} 
	
	public Usuarios(String usuario, String contraseña) {}

	public void insertarUsuario( String nombre, String contraseña) {
		
		String usuario = nombre;
		String Contraseña = contraseña;

		conexion.EjecutarUpdate("INSERT INTO infousu (nombre) VALUES ('"+nombre+"');");
	}
	
	public Infousu recogerUsuarios(String usuario, String contraseña) {
		ResultSet resultado = conexion.EjecutarSentencia("select * from infousu where usuario='"+usuario+"' and contraseña='"+contraseña+"';");
		try {
			if(resultado.next()) {
		
				String Usuario = resultado.getString("usuario");
				String Contraseña = resultado.getString("contraseña");
				Infousu infousuRecogido = new Infousu (usuario, contraseña);
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
				String contraseña = resultado.getString("contraseña");
				infousu.add(new Infousu(nombre, contraseña));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return infousu;
	}


}
