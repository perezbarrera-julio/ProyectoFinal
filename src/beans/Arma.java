package beans;


public class Arma {
    
    private String tipo;
	private String nombre;
	private int precio;
    private int cargador;
    private int municion;
    private String nacionalidad;
    private String usuario;
	private String contraseña;
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCargador() {
        return cargador;
    }
    public void setCargador(int cargador) {
        this.cargador = cargador;
    }
    public int getMunicion() {
        return municion;
    }
    public void setMunicion(int municion) {
        this.municion = municion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getUsuario() {
    	return usuario;
    }
    public void setUsuario(String Usuario) {
    	this.usuario = Usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}