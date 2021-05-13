package beans;

public class Infousu {
	
	
	private int ID;
    private String Contraseña;
    private String Usuario;
   
    public Infousu(String usuario2, String contraseña2) {
		
	}
	public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getUsuario() {
    	return Usuario;
    }
    public void setUsuario(String usuario) {
    	this.Usuario = usuario;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String contraseña) {
        this.Contraseña = contraseña;
    }
}
