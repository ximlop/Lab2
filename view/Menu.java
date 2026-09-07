package view;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Boolean running = true;
    private int seleccion;

    private void showOpciones() {
        System.out.println("\n--- MENÚ PARQUE UNIVERSITARIO DE ATRACCIONES ---");
        System.out.println("1. Crear nuevo parque");
        System.out.println("2. Gestionar puntos de acceso");
        System.out.println("3. Gestionar visitantes");
        System.out.println("4. Mostrar reporte del parque");
        System.out.println("5. Salir");
    }

    ParqueView parqueView = new ParqueView();
    PuntoAccesoView puntoAccesoView = new PuntoAccesoView(parqueView);


    public void inicio(){
        while(running){
            showOpciones();
            seleccion = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (seleccion){
                    case 5:
                        running = false;
                        break;
                    case 1:
                        parqueView.mostrarParqueView(scanner);
                        break;
                    case 2:
                        puntoAccesoView.mostrarPuntoAccesoView(scanner); //TERMINAR
                        break;
                    case 3:
                        System.out.println("Gestionar visitantes"); //TERMINAR
                        break;
                    case 4:
                        parqueView.mostrarParqueInfo(); //TERMINAR
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        break;
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        
        }
    }
}
