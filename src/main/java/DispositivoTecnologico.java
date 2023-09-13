public class DispositivoTecnologico {
	private String marca;
	private String memoriaRam;
	private String memoriaDeAlmacenamiento;
	private String procesador;
	private String modelo;
	private int añoDeFabricacion;
	private String precio;
	private int stock;
	private String tipo;
	public TiendaTecnologica unnamed_TiendaTecnologica_;

	public DispositivoTecnologico() {
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMemoriaRam() {
		return this.memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getMemoriaDeAlmacenamiento() {
		return this.memoriaDeAlmacenamiento;
	}

	public void setMemoriaDeAlmacenamiento(String memoriaDeAlmacenamiento) {
		this.memoriaDeAlmacenamiento = memoriaDeAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoDeFabricacion() {
		return this.añoDeFabricacion;
	}

	public void setAñoDeFabricacion(int añoDeFabricacion) {
		this.añoDeFabricacion = añoDeFabricacion;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public DispositivoTecnologico(String marca, String memoriaRam, String memoriaDeAlmacenamiento, String procesador, String modelo, int añoDeFabricacion, int precio, int stock, String tipo) {
		super();
	}

	Notebook notebook = new Notebook("1024x768", new String(), 5000);
	String tipoNotebook = notebook.getTipo(); // Devuelve "Notebook"

	ComputadorDeEscritorio computadorDeEscritorio = new ComputadorDeEscritorio("040715", new String(), 2050.0, 345.0);
	String tipoComputadorDeEscritorio = computadorDeEscritorio.getTipo(); // Devuelve "Computador de escritorio"

	Tablet tablet = new Tablet("040715", new String(), 2050.0, 345.0);
	String tipoTablet = tablet.getTipo(); // Devuelve "Tablet"
}