package partido;

import java.util.LinkedList;

public class GestorEquipos {
    private LinkedList<Equipo> equipos;

    // Constructor
    public GestorEquipos() {
        this.equipos = new LinkedList<>();
    }

    // Métodos
    public void jugarPartido(Equipo equipo1, Equipo equipo2) {
        // Implementación de la simulación del partido
        System.out.println("Simulando partido entre " + equipo1.getNombre() + " y " + equipo2.getNombre());
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void eliminarEquipo(Equipo equipo) {
        equipos.remove(equipo);
    }

    public Equipo buscarEquipo(String nombre) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombre)) {
                return equipo;
            }
        }
        return null; // Si no se encuentra al equipo
    }

    public int cantidadTotalEquipos() {
        return equipos.size();
    }

    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }
}
