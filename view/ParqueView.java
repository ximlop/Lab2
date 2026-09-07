package view;

import controller.ParqueController;

import java.util.Scanner;

public class ParqueView {
    
    public ParqueController controller = new ParqueController();

    public void mostrarParqueView(Scanner scanner){
        System.out.println("Ingrese el nombre del parque");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el Código de identificación del parque");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el Nombre del encargado");
        String encargado = scanner.nextLine();

        controller.crearParque(nombre, id, encargado);
    }

    public void mostrarParqueInfo(){
        System.out.println(controller.getParque()); //TERMINAR
    }


}
