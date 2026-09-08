package view;

import java.util.Scanner;

import controller.PuntoAccesoController;

public class PuntoAccesoView {
    private boolean running;
    private PuntoAccesoController controller;
    private int seleccion;

    public PuntoAccesoView(ParqueView parqueView) {
        this.controller = new PuntoAccesoController(parqueView.controller);
    }

    private void showOpcionesPuntosAcceso() {
        System.out.println("\n--- PUNTOS DE ACCESO ---");
        System.out.println("1. Habilitar punto de acceso");
        System.out.println("2. Consultar puntos de acceso");
        System.out.println("3. Consultar un punto de acceso");
        System.out.println("4. Modificar punto de acceso");
        System.out.println("5. Cerrar punto de acceso");
        System.out.println("6. Regresar al menú principal");
    }

    private int codigo;
    private String nombre;
    private String ubicacion;
    private int capacidadHora;
    private boolean estado;

    public void mostrarPuntoAccesoView(Scanner scanner) {
        if (!controller.verificarParqueCreado()) {
            System.out.println("No se ha creado un parque. Por favor, cree un parque primero.");
            return;
        }
        running = true;
        while(running){
            showOpcionesPuntosAcceso();
            seleccion = scanner.nextInt();
            scanner.nextLine();
            switch (seleccion) {
                case 6:
                    running = false;
                    break;
                case 1:
                    System.out.println("Ingrese el código del punto de acceso");
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del punto de acceso");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese la ubicación del punto de acceso");
                    ubicacion = scanner.nextLine();
                    System.out.println("Ingrese la capacidad por hora del punto de acceso");
                    capacidadHora = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el estado del punto de acceso (true/false)");
                    estado = scanner.nextBoolean();

                    System.out.println("Ingrese el índice del punto de acceso (0-4)");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    controller.agregarPuntoAcceso(index, codigo, nombre, ubicacion, capacidadHora, estado);
                    break;
                case 2:
                    controller.consultarPuntosAcceso();
                    break;
                case 3:
                    System.out.println("Ingrese el índice del punto de acceso (0-4)");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    controller.consultarPuntoAcceso(index);
                    break;
                case 4:
                    System.out.println("Modificar punto de acceso"); //TERMINAR
                    break;
                case 5:
                    System.out.println("Cerrar punto de acceso"); //TERMINAR
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        
    }
}
