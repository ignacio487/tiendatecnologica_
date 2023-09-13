import java.util.ArrayList;

public class Compra {
	private int fechaDeCompra;
	private Cliente cliente;

	public int getFechaDeCompra() {
		return this.fechaDeCompra;
	}

	public void setFechaDeCompra(int fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	public ArrayList<Cliente> asociarCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> listaDeDispositivosTecnologicos(DispositivoTecnologico dispositivo) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<DispositivoTecnologico> agregarOQuitarProductos(int stock) {
		throw new UnsupportedOperationException();
	}
}