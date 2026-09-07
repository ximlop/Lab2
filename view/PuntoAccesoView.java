package view;

import java.util.Scanner;

import controller.PuntoAccesoController;

public class PuntoAccesoView {
    boolean running = true;
    PuntoAccesoController controller = new PuntoAccesoController();
    private int seleccion;

    private void showOpcionesPuntosAcceso() {
        System.out.println("\n--- PUNTOS DE ACCESO ---");
        System.out.println("1. Habilitar punto de acceso");
        System.out.println("2. Consultar puntos de acceso");
        System.out.println("3. Consultar un punto de acceso");
        System.out.println("4. Modificar punto de acceso");
        System.out.println("5. Cerrar punto de acceso");
        System.out.println("6. Regresar al menú principal");
    }

    public void mostrarPuntoAccesoView(Scanner scanner) {
        if (!controller.verificarParqueCreado()) {
            System.out.println("No se ha creado un parque. Por favor, cree un parque primero.");
            return;
        }
        while(running){
            showOpcionesPuntosAcceso();
            seleccion = scanner.nextInt();
            switch (seleccion) {
                case 6:
                    running = false;
                    break;
                case 1:
                    System.out.println("Ingrese el código del punto de acceso");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del punto de acceso");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la ubicación del punto de acceso");
                    String ubicacion = scanner.nextLine();
                    System.out.println("Ingrese la capacidad por hora del punto de acceso");
                    int capacidadHora = scanner.nextInt();
                    System.out.println("Ingrese el estado del punto de acceso (true/false)");
                    boolean estado = scanner.nextBoolean();

                    System.out.println("Ingrese el índice del punto de acceso (0-4)");
                    int index = scanner.nextInt();
                    controller.agregarPuntoAcceso(index, codigo, nombre, ubicacion, capacidadHora, estado);
                    break;
                case 2:
                    System.out.println("Consultar puntos de acceso");
                    break;
                case 3:
                    System.out.println("Consultar un punto de acceso");
                    break;
                case 4:
                    System.out.println("Modificar punto de acceso");
                    break;
                case 5:
                    System.out.println("Cerrar punto de acceso");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        
    }
}
