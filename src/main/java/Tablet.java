import java.util.ArrayList;

public class Tablet extends DispositivoTecnologico {
	private String resolucionDeLaPantalla;
	public Accesorio unnamed_Accesorio_;

	public String getResolucionDeLaPantalla() {
		return this.resolucionDeLaPantalla;
	}

	public void setResolucionDeLaPantalla(String resolucionDeLaPantalla) {
		this.resolucionDeLaPantalla = resolucionDeLaPantalla;
	}

	public ArrayList<Accesorio> listaDeAccesorios(Accesorio accesorio) {
		throw new UnsupportedOperationException();
	}

	public Tablet(String resolucionDeLaPantalla) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}