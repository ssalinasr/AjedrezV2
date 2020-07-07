package Ficha;


import java.util.*;

public abstract class Ficha implements Animación{

    private String color;
    private int x,y;
    private boolean estado;
    /**
     * Default constructor
     */
    public Ficha(String color,int x, int y, boolean estado) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.estado = estado;   
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public abstract void mover(int x, int y);
    public abstract void eliminar();
    public abstract void realizarAnimacion();

}