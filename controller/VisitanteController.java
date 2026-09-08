package controller;
import model.Visitante;

import java.util.ArrayList;

public class VisitanteController {
    private ParqueController parqueController;

    public VisitanteController(ParqueController parqueController) {
        this.parqueController = parqueController;
    }

    public boolean verificarParqueCreado(){
        if(parqueController.getParque() != null){
            return true;
        }
        return false;
    }

    public void verificarVisitanteID(int id){
        for (Visitante visitante : parqueController.getParque().getVisitante()) {
            if (visitante.getCodigoEntrada() == id) {
                System.out.printf("El visitante con ID %d ya existe.\n", id);
                return;
            }
        }
    }

    public void agregarVisitante(String nombre, int id, int edad, int cantidadAtraccion, int puntos){
        Visitante visitante = new Visitante(nombre, id, edad, cantidadAtraccion, puntos);
        
        verificarVisitanteID(id);
        parqueController.getParque().addVisitante(visitante);
    }

    public void consultarVisitantes(){
        ArrayList<Visitante> visitantes = parqueController.getParque().getVisitante();
        int count = 0;

        for(int i = 0; i < visitantes.size(); i++){
            if (visitantes.get(i) != null){
                System.out.printf("Visitante %s con código de entrada %d\n",visitantes.get(i).getNombreVisitante(),visitantes.get(i).getCodigoEntrada());
                count++;
            }
        }
        if (count == 0){
                System.out.println("No hay visitantes registrados.");;
        }
    }
    public void buscarVisitante(int id){
        ArrayList<Visitante> visitantes = parqueController.getParque().getVisitante();
        for (Visitante visitante : visitantes) {
            if (visitante.getCodigoEntrada() == id) {
                System.out.printf("Información sobre Visitante\n");
                System.out.printf("Nombre: %s\n", visitante.getNombreVisitante());
                System.out.printf("Edad: %d\n", visitante.getEdad());
                System.out.printf("Cantidad de atracciones visitadas: %d\n", visitante.getCantidadAtraccion());
                System.out.printf("Puntos: %d\n", visitante.getPuntos());
                return;
            }
        }
        System.out.printf("No se encontró un visitante con ID %d.\n", id);
    }

    public Visitante indexVisitante(int codigoEntrada){
        return parqueController.getParque().buscarVisitante(codigoEntrada);
    }

    public void modificarVisitante(int codigoEntrada, String nombre, int edad, int cantidadAtraccion, int puntos){
        Visitante visitante = indexVisitante(codigoEntrada);

        if(visitante == null){
            throw new IllegalArgumentException("No existe un visitante con el código de entrada " + codigoEntrada);
        }

        visitante.setNombreVisitante(nombre);
        visitante.setEdad(edad);
        visitante.setCantidadAtraccion(cantidadAtraccion);
        visitante.setPuntos(puntos);
    }

    public void eliminarVisitante(int codigoEntrada){
        Visitante visitante = indexVisitante(codigoEntrada);

        if(visitante == null){
            throw new IllegalArgumentException("No existe un visitante con el código de entrada " + codigoEntrada);
        }

        parqueController.getParque().eliminarVisitante(visitante);
    }


}
