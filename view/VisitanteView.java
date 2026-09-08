package view;

import controller.VisitanteController;
import java.util.Scanner;

public class VisitanteView {
    private boolean running = true;
    public VisitanteController controller;
    private int seleccion;

    public VisitanteView(ParqueView parqueView) {
        this.controller = new VisitanteController(parqueView.controller);
    }

    private void showOpcionesVisitantes() {
        System.out.println("\n--- VISITANTES ---");
        System.out.println("1. Registrar visitante");
        System.out.println("2. Consultar visitantes");
        System.out.println("3. Buscar visitante");
        System.out.println("4. Modificar visitante");
        System.out.println("5. Eliminar visitante");
        System.out.println("6. Regresar al menú principal");
    }

    public void mostrarVisitanteView(Scanner scanner){
        if (!controller.verificarParqueCreado()) {
            System.out.println("No se ha creado un parque. Por favor, cree un parque primero.");
            return;
        }

        while(running){
            showOpcionesVisitantes();
            seleccion = scanner.nextInt();
            scanner.nextLine();
            switch(seleccion){
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
                case 1:
                    System.out.println("Ingrese el nombre del visitante");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese el ID del visitante");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese la edad del visitante");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese la cantidad de atracciones visitadas");
                    int cantidadAtraccion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese los puntos del visitante");
                    int puntos = scanner.nextInt();
                    scanner.nextLine();

                    controller.agregarVisitante(nombre, id, edad, cantidadAtraccion, puntos);
                    break;
                case 2:
                    System.out.println("Consultar visitantes"); //TERMINAR
                    break;
                case 3:
                    System.out.println("Buscar visitante"); //TERMINAR
                    break;

                case 4:
                    System.out.println("Modificar visitante");
                    System.out.println("Ingrese el código de entrada del visitante para modificar");
                    int codigoModificar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el nuevo nombre del visitante");
                    String nuevoNombre = scanner.nextLine();

                    System.out.println("Ingrese la nueva edad del visitante");
                    int nuevaEdad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese la nueva cantidad de atracciones visitadas");
                    int nuevaCantidadAtraccion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese los nuevos puntos del visitante");
                    int nuevosPuntos = scanner.nextInt();
                    scanner.nextLine();

                    controller.modificarVisitante(codigoModificar, nuevoNombre, nuevaEdad, nuevaCantidadAtraccion, nuevosPuntos);
                    System.out.println("Visitante modificado correctamente");
                    break;

                case 5:
                    System.out.println("Eliminar visitante");
                    System.out.println("Ingrese el código de la entrada del visitante para eliminar");
                    int codigoEliminar = scanner.nextInt();
                    scanner.nextLine();

                    controller.eliminarVisitante(codigoEliminar);
                    System.out.println("Visitante eliminado");
                    break;
            }
        }
    }
}
