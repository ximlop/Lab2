package model;

import java.util.ArrayList;

public class Parque {
    private String nombre;
    private int id;
    private String encargado;
    private PuntoAcceso[] accesos = new PuntoAcceso[5];
    private ArrayList<Visitante> visitantes = new ArrayList<>();

    public Parque(int id, String nombre, String encargado){
        this.id = id;
        this.nombre = nombre;
        this.encargado = encargado;
    }

    public String getNombreParque(){
        return nombre;
    }

    public void setNombreParque(String nombre){
        this.nombre = nombre;
    }

    public int getCodigo(){
        return id;
    }

    public void setCodigo(int id){
        this.id = id;
    }

    public String getNombreEncargado(){
        return encargado;
    }

    public void setNombreEncargado(String encargado){
        this.encargado = encargado;
    }

    public PuntoAcceso[] getAcceso(){
        return accesos;
    }

    public void setAcceso(int index, PuntoAcceso acceso){
        this.accesos[index] = acceso;
    }

    public ArrayList<Visitante> getVisitante(){
        return visitantes;
    }

    public void addVisitante(Visitante visitante){
        this.visitantes.add(visitante);
    }

    public boolean posicionValida(int index){
        return index >= 0 && index < accesos.length;
    }

    public boolean posicionDisponible(int index){
        return accesos[index] == null;
    }

    public Visitante buscarVisitante(int codigoEntrada){
        for(Visitante v : visitantes){
            if(v.getCodigoEntrada() == codigoEntrada){
                return v;
            }
        }
        return null;
    }

    public void eliminarVisitante(Visitante visitante){
        this.visitantes.remove(visitante);
    }

}