package partido;

public class Main {
    public static void main(String[] args) {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Lionel Messi", "Delantero", 10, 34);
        Jugador jugador2 = new Jugador("Cristiano Ronaldo", "Delantero", 7, 36);
        Jugador jugador3 = new Jugador("Neymar Jr.", "Delantero", 10, 29);

        // Crear equipos
        Equipo barcelona = new Equipo("Barcelona", "Barcelona");
        barcelona.agregarJugador(jugador1);
        barcelona.agregarJugador(jugador3);

        Equipo juventus = new Equipo("Juventus", "Turín");
        juventus.agregarJugador(jugador2);

        // Crear gestor de equipos
        GestorEquipos gestor = new GestorEquipos();
        gestor.agregarEquipo(barcelona);
        gestor.agregarEquipo(juventus);

        // Pruebas
        System.out.println("Cantidad total de equipos: " + gestor.cantidadTotalEquipos());
        System.out.println("Cantidad total de jugadores en Barcelona: " + barcelona.cantidadTotalJugadores());

        Jugador encontrado = barcelona.buscarJugador("Lionel Messi");
        if (encontrado != null) {
            System.out.println("Jugador encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("Jugador no encontrado.");
        }

        gestor.jugarPartido(barcelona, juventus);
    }
}

