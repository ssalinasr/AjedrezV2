package Ficha;
import Ficha.Ficha;
import java.util.*;

/**
 * 
 */
public class Torre extends Ficha {

    /**
     * Default constructor
     */
    public Torre(String color, int x, int y, boolean estado){
        super(color,x,y,estado);
    }

    @Override
    public void mover(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void realizarAnimacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}