package controller;

import model.PuntoAcceso;

public class PuntoAccesoController {
    private ParqueController parqueController;

    public PuntoAccesoController(ParqueController parqueController) {
        this.parqueController = parqueController;
    }

    public void agregarPuntoAcceso(int index, int codigo, String nombre, String ubicacion, int capacidadHora, boolean estado){
        PuntoAcceso accceso = new PuntoAcceso(codigo, nombre, ubicacion, capacidadHora, estado);
        parqueController.getParque().setAcceso(index, accceso);
    }

    public boolean verificarParqueCreado(){
        if(parqueController.getParque() != null){
            return true;
        }
        return false;
    }


}
