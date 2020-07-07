package jugador;
import java.util.*;

/**
 * 
 */
public class Jugador {

    private String nombre;
    private String equipo;
    private boolean estado;
    
    public Jugador(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public void crearJugador(String nombre, String equipo, boolean estado) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.estado = estado;
    }

}