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

    public void consultarPuntosAcceso(){
        PuntoAcceso[] accesos = parqueController.getParque().getAcceso();
        int count = 0;

        for(int i = 0; i < accesos.length; i++){
            if (accesos[i] != null){
                System.out.printf("Punto de acceso %s en posicion %d\n",accesos[i].getNombrePuntoAcceso(),i);
                count++;
            }
        }
        if (count == 0){
                System.out.println("No hay puntos de acceso habilitados.");;
        }
    }
    public void consultarPuntoAcceso(int index){
        PuntoAcceso[] accesos = parqueController.getParque().getAcceso();
        PuntoAcceso acceso = accesos[index];
        if (acceso != null) {
            System.out.printf("Información sobre Punto de Acceso\n");
            System.out.printf("Nombre: %s\n", acceso.getNombrePuntoAcceso());
            System.out.printf("Ubicación: %s\n", acceso.getUbicacion());
            System.out.printf("Capacidad por hora: %d\n", acceso.getCapacidadHora());
            System.out.printf("Estado: %s\n", acceso.getEstado() ? "Abierto" : "Cerrado");
            return;
        }
        System.out.printf("No hay punto de acceso en la posición %d\n", index);
    }


}
