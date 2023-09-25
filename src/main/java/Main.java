import GestorArchivos.GestorDatos;

import java.util.ArrayList;
import java.util.Date; // Para la fecha
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Main {
    public static void main(String[] args) {
        // Aquí puedes iniciar tu programa

        // Crear una instancia de la tienda tecnológica
        TiendaTecnologica tienda = new TiendaTecnologica();

        // Crear algunos clientes
        Cliente cliente1 = new Cliente("Rodolfo", "r.venegas04@ufromail.cl", "+56956783486", "lautaro", "Soltero", "Venegas");
        Cliente cliente2 = new Cliente("Luis", "l.diaz07@oufromail.cl", "+56939712653", "limache", "Casado", "Diaz");

        // Agregar clientes a la tienda
        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        // Crear algunos dispositivos tecnológicos
        DispositivoTecnologico dispositivo1 = new DispositivoTecnologico(/* especifica los atributos */);
        DispositivoTecnologico dispositivo2 = new DispositivoTecnologico(/* especifica los atributos */);

        // Agregar dispositivos al catálogo de la tienda
        Compra.agregarDispositivos(dispositivo1);
        Compra.agregarDispositivos(dispositivo2);

        // Realizar una compra
        Compra compra = new Compra();
        compra.getFechaDeCompra();
        compra.clientes(cliente1);
        compra.dispositivosComprados(dispositivo1);
        compra.dispositivosComprados(dispositivo2);

        // Agregar la compra a la lista de compras de la tienda
        tienda.agregarCompra(compra);

        // Puedes continuar interactuando con tu sistema aquí

        // Ejemplo de búsqueda de dispositivos por tipo
        ArrayList<DispositivoTecnologico> dispositivosPorTipo = tienda.buscarDispositivosPorTipo("Portátil");
        for (DispositivoTecnologico dispositivo : dispositivosPorTipo) {
            System.out.println("Dispositivo: " + dispositivo.getMarca() + " " + dispositivo.getModelo());
        }
    }
    // Al finalizar el programa, guardaremos la información en un archivo TXT
    public static void guardarInformacionEnTXT(TiendaTecnologica tienda) {
        String filePath = "informacion.txt"; // Ruta del archivo TXT

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Guardar información de la tienda
            writer.write("Información de la Tienda Tecnológica:\n");
            writer.write("Dirección: " + tienda.getDireccion() + "\n\n");

            // Guardar información de clientes
            writer.write("Clientes:\n");
            for (Cliente cliente : GestorDatos.guardarCliente()) {
                writer.write("Nombre: " + cliente.getNombre() + "\n");
                writer.write("Correo Electrónico: " + cliente.getCorreoElectronico() + "\n");
                writer.write("Número de Contacto: " + cliente.getNumeroDeContacto() + "\n");
                writer.write("Estado Civil: " + cliente.getEstadoCivil() + "\n");
                writer.write("Ciudad: " + cliente.getCiudad() + "\n");
                writer.write("\n");
            }

            // Guardar información de compras (puedes adaptar esto según tus necesidades)
            writer.write("Compras realizadas:\n");
            for (Compra compra : TiendaTecnologica.agregarCompra()) {
                writer.write("Fecha de Compra: " + compra.getFechaDeCompra() + "\n");
                writer.write("Cliente: " + GestorDatos.guardarCliente().getNombre() + "\n");
                writer.write("Dispositivos Comprados:\n");
                for (DispositivoTecnologico dispositivo : compra.getDispositivosComprados()) {
                    writer.write("- " + dispositivo.getMarca() + " " + dispositivo.getModelo() + "\n");
                }
                writer.write("\n");
            }

            System.out.println("La información se ha guardado en el archivo " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}