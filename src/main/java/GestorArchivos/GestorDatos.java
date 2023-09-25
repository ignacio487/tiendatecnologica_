package GestorArchivos;

import java.util.ArrayList;

public class GestorDatos<Cliente> {

	public ArrayList<Cliente> datosCliente(String nombre){
		ArrayList<Cliente> resultados = new ArrayList<>();
		for (Cliente cliente : clientes) {
			if (Cliente.getNombre().equalsIgnoreCase()) {
				resultados.add(cliente);
			}
		}
		return resultados;
	}

	public void guardarCliente(Cliente cliente) {
		// Verificar si el cliente ya existe (puedes usar otros criterios de verificación)
		if (!cliente.contains(cliente)) {
			cliente.add(cliente);
		} else {
			System.out.println("El cliente ya existe en la lista.");
		}
	}
	}