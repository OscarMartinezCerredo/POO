package poo3V2;

import java.util.HashMap;

public class Hotel {
    private HashMap<Integer, Habitacion> habitaciones; // Declaración de una variable de tipo HashMap

    public Hotel(int numHabitaciones) {
        habitaciones = new HashMap<>();
        inicializarHabitaciones(numHabitaciones);
    }

    private void inicializarHabitaciones(int numHabitaciones) {
    	String tipo;
        for (int i = 1; i <= numHabitaciones; i++) {
        	if (i%3==0) {
            tipo = "simple";
        }else if(i%2==0) {
        	 tipo = "doble";
        }else {
        	tipo = "suite";
        }
        	habitaciones.put(i, new Habitacion(i, tipo));
    }
    }
    public void mostrarDisponibilidad() {
        for (Habitacion habitacion : habitaciones.values()) {
            String estado = habitacion.isOcupada() ? "Ocupada" : "Disponible";
            System.out.println("Habitación " + habitacion.getNumeroHabitacion() + " - Tipo: " + habitacion.getTipo() +
                    " - Estado: " + estado);
        }
    }

    public void reservarHabitacion(int numeroHabitacion) {
        Habitacion habitacion = habitaciones.get(numeroHabitacion);
        if (habitacion != null) {
            habitacion.reservar();
        } else {
            System.out.println("Número de habitación no válido.");
        }
    }

    public void cancelarReservaHabitacion(int numeroHabitacion) {
        Habitacion habitacion = habitaciones.get(numeroHabitacion);
        if (habitacion != null) {
            habitacion.cancelarReserva();
        } else {
            System.out.println("Número de habitación no válido.");
        }
    }
}
