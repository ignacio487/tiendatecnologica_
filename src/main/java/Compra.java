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

	public ArrayList<DispositivoTecnologico> getDispositivosComprados() {
		return this.dispositivosComprados;
	}

	public void agregarDispositivos(DispositivoTecnologico dispositivo) {
		if (dispositivosComprados == null) {
			dispositivosComprados = new ArrayList<>();
		}

		dispositivosComprados.add(dispositivo);
	}

	public void QuitarProductos(int stock) {
		if (dispositivosComprados != null) {
			dispositivosComprados.remove(dispositivosComprados);
		}
	}

	//asociar cliente a una compra
	public void clientes(Cliente cliente1) {
		this.cliente=cliente1;
	}

	public void dispositivosComprados(DispositivoTecnologico dispositivo1) {

	}
}