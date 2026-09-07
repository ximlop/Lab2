package controller;

import model.Parque;

public class ParqueController {
    private Parque parque;

    public void crearParque(String nombre, int id, String encargado){
        parque = new Parque(id, nombre, encargado);
    }

    public Parque getParque(){
        return parque;
    }

    


}
