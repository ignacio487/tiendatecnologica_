import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Aquí puedes iniciar tu programa

        // Crear una instancia de la tienda tecnológica
        TiendaTecnologica tienda = new TiendaTecnologica();

        // Crear algunos clientes
        Cliente cliente1 = new Cliente("Rodolfo", "Venegas", "r.venegas04@ufromail.cl", "lautaro", "Soltero", "Ciudad1");
        Cliente cliente2 = new Cliente("Luis", "Diaz", "l.diaz07@oufromail.cl", "limache", "Casado", "Ciudad2");

        // Agregar clientes a la tienda
        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        // Crear algunos dispositivos tecnológicos
        DispositivoTecnologico dispositivo1 = new DispositivoTecnologico(/* especifica los atributos */);
        DispositivoTecnologico dispositivo2 = new DispositivoTecnologico(/* especifica los atributos */);

        // Agregar dispositivos al catálogo de la tienda
        tienda.agregarDispositivos(dispositivo1);
        tienda.agregarDispositivos(dispositivo2);

        // Realizar una compra
        Compra compra = new Compra();
        compra.setFechaDeCompra(new Date());
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
}