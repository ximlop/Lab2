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



}
