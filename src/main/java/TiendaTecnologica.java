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

	public void agregarCliente(Cliente cliente) {
		this.cliente.add(cliente);
	}

	public ArrayList<DispositivoTecnologico> catalogo() {
		ArrayList<DispositivoTecnologico> dispositivosDisponibles = new ArrayList<>();
		// Llenar la lista 'dispositivosDisponibles' con los dispositivos disponibles.
		return dispositivosDisponibles;
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivosPorTipo(String tipo) {
		//busca el dispositivo tecnologico por tipo
		ArrayList<DispositivoTecnologico> dispositivosPorTipo = new ArrayList<>();
		for (DispositivoTecnologico dispositivo : DispositivoTecnologico) {
			if (dispositivo.getTipo().equalsIgnoreCase(tipo)) {
				dispositivosPorTipo.add(dispositivo); //agrega un nuevo dispositivo por tipo
			}
		}
		return dispositivosPorTipo;
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivosPorMarca(String marca) {
		ArrayList<DispositivoTecnologico> dispositivosPorMarca = new ArrayList<>();
		for (DispositivoTecnologico dispositivo : DispositivoTecnologico) {
			if (dispositivo.getMarca().equalsIgnoreCase(marca)) {
				dispositivosPorMarca.add(dispositivo); //agrega un nuevo dispositivo por marca
			}
		}
		return dispositivosPorMarca;
	}

	public ArrayList<DispositivoTecnologico> buscarDispositivosPorModelo(String modelo) {
		ArrayList<DispositivoTecnologico> dispositivosPorModelo = new ArrayList<>();
		for (DispositivoTecnologico dispositivo : DispositivoTecnologico) {
			if (dispositivo.getModelo().equalsIgnoreCase(modelo)) {
				dispositivosPorModelo.add(dispositivo);
			}
		}
		return dispositivosPorModelo;
	}
}