package partida;
import jugador.Jugador;
import tablero.Tablero;
import tablero.ControlPartida;
import java.util.*;

/**
 * 
 */
public class Partida {

    private Tablero tableroActual;
    private Jugador jugadorA;
    private Jugador jugadorB;
    private ControlPartida controlador;
    
    public Partida(Jugador A, Jugador B){
        this.tableroActual = new Tablero();
        this.jugadorA = A;
        this.jugadorB = B;
        this.controlador = new ControlPartida();
    }


    public void crearPartida() {
        this.tableroActual.crearTablero();
        this.jugadorA.crearJugador("Jugador 1", "Blanco", true);
        this.jugadorB.crearJugador("Jugador 2", "Negro", true);
        this.controlador.actual();
    }

}