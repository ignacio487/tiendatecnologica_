import java.util.ArrayList;

public class Compra {
	private int fechaDeCompra;
	private Cliente cliente;

	public ArrayList<Cliente> clientes;
	public ArrayList<DispositivoTecnologico> dispositivosComprados; //creamos "dispositivos comprados" para justificar la resta y suma de stock

	public int getFechaDeCompra() {
		return this.fechaDeCompra;
	}

	public void setFechaDeCompra(int fechaDeCompra) {
		this.fechaDeCompra = fechaDeCompra;
	}

	//Asociar cliente a una compra
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<DispositivoTecnologico> getDispositivosComprados() {
		return this.dispositivosComprados;
	}

	public void listaDeDispositivosTecnologicos(DispositivoTecnologico dispositivo) {
		if (dispositivosComprados == null) {
			dispositivosComprados = new ArrayList<>();
		}

		dispositivosComprados.add(dispositivo);
	}

	public void agregarOQuitarProductos(int stock) {
		if (dispositivosComprados != null) {
			dispositivosComprados.remove(dispositivosComprados);
		}
	}
}