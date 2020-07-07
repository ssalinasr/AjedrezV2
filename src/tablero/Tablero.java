package tablero;
import Ficha.*;
import java.util.*;
import javax.swing.JLabel;

/**
 * 
 */
public class Tablero {

    private Ficha Tablero[][];
    
    public Tablero(){
        this.Tablero = new Ficha[8][8];
    }

    public Ficha[][] getTablero() {
        return Tablero;
    }
    
    public void crearTablero(){       
        this.Tablero[7][0] = new Torre("blanco",7,0, true);
        this.Tablero[7][7] = new Torre("blanco",7,7, true);
        this.Tablero[7][1] = new Caballo("blanco",7,1, true);
        this.Tablero[7][6] = new Caballo("blanco",7,6, true);
        this.Tablero[7][2] = new Alfil("blanco",7,2, true);
        this.Tablero[7][3] = new Alfil("blanco",7,5, true);
        this.Tablero[7][4] = new Reina("blanco",7,3, true);
        this.Tablero[7][5] = new Rey("blanco",7,4, true);
        this.Tablero[6][0] = new Peon("blanco",6,0, true);
        this.Tablero[6][1] = new Peon("blanco",6,1, true);
        this.Tablero[6][2] = new Peon("blanco",6,2, true);
        this.Tablero[6][3] = new Peon("blanco",6,3, true);
        this.Tablero[6][4] = new Peon("blanco",6,4, true);
        this.Tablero[6][5] = new Peon("blanco",6,5, true);
        this.Tablero[6][6] = new Peon("blanco",6,6, true);
        this.Tablero[6][7] = new Peon("blanco",6,7, true);
        
        this.Tablero[0][0] = new Torre("negro",0,0, true);
        this.Tablero[0][7] = new Torre("negro",0,7, true);
        this.Tablero[0][1] = new Caballo("negro",0,1, true);
        this.Tablero[0][6] = new Caballo("negro",0,6, true);
        this.Tablero[0][2] = new Alfil("negro",0,2, true);
        this.Tablero[0][3] = new Alfil("negro",0,5, true);
        this.Tablero[0][4] = new Reina("negro",0,3, true);
        this.Tablero[0][5] = new Rey("negro",0,4, true);
        this.Tablero[1][0] = new Peon("negro",1,0, true);
        this.Tablero[1][1] = new Peon("negro",1,1, true);
        this.Tablero[1][2] = new Peon("negro",1,2, true);
        this.Tablero[1][3] = new Peon("negro",1,3, true);
        this.Tablero[1][4] = new Peon("negro",1,4, true);
        this.Tablero[1][5] = new Peon("negro",1,5, true);
        this.Tablero[1][6] = new Peon("negro",1,6, true);
        this.Tablero[1][7] = new Peon("negro",1,7, true);

}
}