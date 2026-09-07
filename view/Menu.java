package view;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Boolean running = true;

    private void showOpciones() {
        System.out.println("\n--- MENÚ PARQUE UNIVERSITARIO DE ATRACCIONES ---");
        System.out.println("1. Crear nuevo parque");
        System.out.println("2. Gestionar puntos de acceso");
        System.out.println("3. Gestionar visitantes");
        System.out.println("4. Mostrar reporte del parque");
        System.out.println("5. Salir");
    }

    public void inicio(){
        
        while(running){
            showOpciones();
            int seleccion = scanner.nextInt();
            try {
                switch (seleccion){
                    case 5:
                        running = false;
                        break;
                    case 1:
                        ParqueView parqueView = new ParqueView();
                        parqueView.mostrarParqueView();
                        break;
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        
        }
    }
}
