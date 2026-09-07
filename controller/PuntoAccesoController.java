package controller;
import model.Parque;

import model.PuntoAcceso;

public class PuntoAccesoController {
    private Parque parque;

    public PuntoAccesoController() {
        ParqueController parqueController = new ParqueController();
        parque = parqueController.getParque();
    }

    public void agregarPuntoAcceso(int index, int codigo, String nombre, String ubicacion, int capacidadHora, boolean estado){
        PuntoAcceso accceso = new PuntoAcceso(codigo, nombre, ubicacion, capacidadHora, estado);
        parque.setAcceso(index, accceso);
    }

    public boolean verificarParqueCreado(){
        if(parque != null){
            return true;
        }
        return false;
    }


}
