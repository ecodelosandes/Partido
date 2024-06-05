package partido;

import java.util.LinkedList;

public class Equipo {
    private String nombre;
    private String ciudad;
    private LinkedList<Jugador> jugadores;

    // Constructor
    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = new LinkedList<>();
    }

    // Métodos
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public Jugador buscarJugador(String nombre) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombre)) {
                return jugador;
            }
        }
        return null; // Si no se encuentra al jugador
    }

    public int cantidadTotalJugadores() {
        return jugadores.size();
    }

    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
}
