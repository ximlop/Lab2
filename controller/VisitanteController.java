package controller;
import model.Visitante;

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

    public void agregarVisitante(String nombre, int id, int edad, int cantidadAtraccion, int puntos){
        Visitante visitante = new Visitante(nombre, id, edad, cantidadAtraccion, puntos);
        parqueController.getParque().addVisitante(visitante);
    }

    public Visitante buscarVisitante(int codigoEntrada){
        return parqueController.getParque().buscarVisitante(codigoEntrada);
    }

    public void modificarVisitante(int codigoEntrada, String nombre, int edad, int cantidadAtraccion, int puntos){
        Visitante visitante = buscarVisitante(codigoEntrada);

        if(visitante == null){
            throw new IllegalArgumentException("No existe un visitante con el código de entrada " + codigoEntrada);
        }

        visitante.setNombreVisitante(nombre);
        visitante.setEdad(edad);
        visitante.setCantidadAtraccion(cantidadAtraccion);
        visitante.setPuntos(puntos);
    }

    public void eliminarVisitante(int codigoEntrada){
        Visitante visitante = buscarVisitante(codigoEntrada);

        if(visitante == null){
            throw new IllegalArgumentException("No existe un visitante con el código de entrada " + codigoEntrada);
        }

        parqueController.getParque().eliminarVisitante(visitante);
    }


}
