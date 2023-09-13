import java.util.ArrayList;
import java.util.Vector;

public class TiendaTecnologica {
	private String direccion;
	public DispositivoTecnologico unnamed_DispositivoTecnologico_;
	private Vector<Cliente> cliente = new Vector<Cliente>();
	private Vector<Compra> compra = new Vector<Compra>();

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Cliente> agregarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> catalogo() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivosPorTipo(String tipo) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivosPorMarca(String marca) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivosPorModelo(String modelo) {
		throw new UnsupportedOperationException();
	}
}