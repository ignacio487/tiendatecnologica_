import java.util.Vector;

public class Cliente {
	private String nombre;
	private String correoElectronico;
	private String estadoCivil;
	private String ciudad;
	private int numeroDeContacto;
	private String apellido;
	private Vector<Compra> compra = new Vector<Compra>();
	private TiendaTecnologica tiendaTecnologica;
	private Vector<DispositivoTecnologico> dispositivoTecnologico = new Vector<DispositivoTecnologico>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumeroDeContacto() {
		return this.numeroDeContacto;
	}

	public void setNumeroDeContacto(int numeroDeContacto) {
		this.numeroDeContacto = numeroDeContacto;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Cliente(String nombre, String correoElectronico, String numeroDeContacto, String ciudad, String estadoCivil, String apellido) {
		super();
	}
}