package model;

public class Visitante {
    private int codigoEntrada;
    private String nombre;
    private int edad;
    private int cantidadAtraccion;
    private int puntos;

    public Visitante(String nombre, int codigoEntrada, int edad, int cantidadAtraccion, int puntos){
        this.nombre = nombre;
        this.codigoEntrada = codigoEntrada;
        this.edad = edad;
        this.cantidadAtraccion = cantidadAtraccion;
        this.puntos = puntos;
    }

    public int getCodigoEntrada(){
        return codigoEntrada;
    }

    public void setCodigoEntrada(int codigoEntrada){
        this.codigoEntrada = codigoEntrada;
    }

    public String getNombreVisitante(){
        return nombre;
    }

    public void setNombreVisitante(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getCantidadAtraccion(){
        return cantidadAtraccion;
    }

    public void setCantidadAtraccion(int cantidadAtraccion){
        this.cantidadAtraccion = cantidadAtraccion;
    }

    public int getPuntos(){
        return puntos;
    }

    public void setPuntos(int puntos){
        this.puntos = puntos;
    }

}