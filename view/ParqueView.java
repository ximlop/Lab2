package view;

import controller.ParqueController;
import java.util.Scanner;

public class ParqueView {

    public void mostrarParqueView(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del parque");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el Código de identificación del parque");
        int id = scanner.nextInt();

        System.out.println("Ingrese el Nombre del encargado");
        String encargado = scanner.nextLine();

        scanner.nextLine();
        ParqueController parqueController = new ParqueController();
        parqueController.crearParque(nombre, id, encargado);

        scanner.close();
    
    }


}
