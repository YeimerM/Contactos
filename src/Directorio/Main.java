package Directorio;

import Controlador.AgendaController;
import Modelo.*;
import Vista.AgendaView;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Agenda model = new Agenda();
                AgendaView view = new AgendaView();
                AgendaController pruebasCtrller = new AgendaController(view,model);
            }
        });
    }
}

/*
*         ContactoDAO dao = new ContactoDAOImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Ver Contactos");
            System.out.println("2. Agregar Contacto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int op = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente después de nextInt()

            if (op == 1) {
                List<Contacto> listaContactos = dao.listarContactos();

                if (listaContactos.isEmpty()) {
                    System.out.println("No hay contactos para mostrar.");
                } else {
                    System.out.println("Lista de Contactos:");
                    for (Contacto contacto : listaContactos) {
                        System.out.println(contacto);
                    }
                }
            } else if (op == 2) {
                int id;
                String fechaNacimiento, nombres, apellidos;

                System.out.print("Id: ");
                id = sc.nextInt();
                sc.nextLine(); // Consumir el salto de línea pendiente después de nextInt()

                System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
                fechaNacimiento = sc.nextLine();

                System.out.print("Nombres: ");
                nombres = sc.nextLine();

                System.out.print("Apellidos: ");
                apellidos = sc.nextLine();

                List<Direccion> direcciones = new ArrayList<>();
                List<Telefono> telefonos = new ArrayList<>();

                Contacto contacto = new Contacto(id, fechaNacimiento, nombres, apellidos, direcciones, telefonos, TipoContacto.EMPLEADO);
                dao.agregarContacto(contacto);
            } else if (op == 3) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        sc.close(); // Cerrar el Scanner al finalizar
*
*
* */