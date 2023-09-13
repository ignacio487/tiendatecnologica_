public class Notebook extends DispositivoTecnologico {
	private String resolucionDePantalla;
	private String tipoDeTeclado;
	private int bateria;

	public Notebook(String resolucionDePantalla, String tipoDeTeclado, int bateria) {
		super();
	}

	public String getResolucionDePantalla() {
		return this.resolucionDePantalla;
	}

	public void setResolucionDePantalla(String resolucionDePantalla) {
		this.resolucionDePantalla = resolucionDePantalla;
	}

	public String getTipoDeTeclado() {
		return this.tipoDeTeclado;
	}

	public void setTipoDeTeclado(String tipoDeTeclado) {
		this.tipoDeTeclado = tipoDeTeclado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getTipo() {
		return getTipo();
	}
}