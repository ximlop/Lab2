package controller;

import model.Parque;

public class ParqueController {
    private Parque parque;

    public void crearParque(String nombre, int id, String encargado){
        Parque parque = new Parque(id, nombre, encargado);
        setParque(parque);
    }

    private Parque setParque(Parque parque){
        this.parque = parque;
        return this.parque;
    }

    


}
