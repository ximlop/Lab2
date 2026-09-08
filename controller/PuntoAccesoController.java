package controller;

import model.Parque;
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

    public void modificarPuntoAcceso(int index, int capacidadHora, boolean estado){
        Parque parque = parqueController.getParque();

        if (!parque.posicionValida(index)){
            throw new IllegalArgumentException("La posición "+ index + " está fuera del rango.");
        }
        
        if (parque.posicionDisponible(index)){
            throw new IllegalArgumentException("La posisión " + index + " no tiene punto de acceso");
        }

        PuntoAcceso acceso = parque.getAcceso()[index];
        acceso.setCapacidadHora(capacidadHora);
        acceso.setEstado(estado);
    }

    public void cerrarPuntoAcceso(int index){
        Parque parque = parqueController.getParque();

        if(!parque.posicionValida(index)){
            throw new IllegalArgumentException("La posición "+ index + " está fuera del rango.");
        }

        if(parque.posicionDisponible(index)){
            throw new IllegalArgumentException("La posición " + index + " ya está vacía");
        }

        parque.setAcceso(index, null);

    }


}
