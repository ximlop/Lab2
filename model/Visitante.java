package model;

public class Visitante {
    private int codigoEntrada;
    private String nombre;
    private int edad;
    private int cantidadAtraccion;
    private int puntos;

    public Visitante(String nombre, int codigoEntrada, int edad, int cantidadAtraccion, int puntos){
        if(edad<= 0){
            throw new IllegalArgumentException("Ingrese edad mayor a cero");
        }
        if(cantidadAtraccion < 0){
            throw new IllegalArgumentException("No puede haber una cantidad de atracciones negativas");
        }
        if(puntos < 0){
            throw new IllegalArgumentException("No puede haber puntos negativos");
        }

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
        if(edad <= 0){
            throw new IllegalArgumentException("Edad mayor a cero");
        }
        this.edad = edad;
    }

    public int getCantidadAtraccion(){
        return cantidadAtraccion;
    }

    public void setCantidadAtraccion(int cantidadAtraccion){
        if(cantidadAtraccion < 0){
            throw new IllegalArgumentException("No puede haber una cantidad de atracciones negativas");
        }
        this.cantidadAtraccion = cantidadAtraccion;
    }

    public int getPuntos(){
        return puntos;
    }

    public void setPuntos(int puntos){
        if(puntos < 0){
            throw new IllegalArgumentException("No puede haber puntos negativos");
        }

        this.puntos = puntos;
    }

}