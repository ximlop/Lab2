package model;

import java.util.ArrayList;

public class PuntoAcceso {
    private int codigo;
    private String nombre;
    private String ubicacion;
    private int capacidadHora;
    private boolean estado;
    private ArrayList<Visitante> visitante;

    public PuntoAcceso(int codigo, String nombre, String ubicacion, int capacidadHora, boolean estado){
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadHora = capacidadHora;
        this.estado = estado;
    }

    public int getCodigo(){
        return codigo;
    } 

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNombrePuntoAcceso(){
        return nombre;
    }

    public void setNombrePuntoAcceso(String nombre){
        this.nombre = nombre;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public int getCapacidadHora(){
        return capacidadHora;
    }

    public void setCapacidadHora(int capacidadHora){
        this.capacidadHora = capacidadHora;
    }

    public boolean getEstado(){
        return estado;
    }

    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public ArrayList<Visitante> getVisitante(){
        return visitante;
    }

    public void setVisitante(ArrayList<Visitante> visitante){
        this.visitante = visitante;
    }

    

}