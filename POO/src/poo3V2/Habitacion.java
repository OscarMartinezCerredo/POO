package poo3V2;

public class Habitacion {
    private int numeroHabitacion;
    private String tipo;
    private boolean ocupada;

    public Habitacion(int numeroHabitacion, String tipo) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.ocupada = false;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void reservar() {
        if (!ocupada) {
            System.out.println("Reserva exitosa para la habitación " + numeroHabitacion);
            ocupada = true;
        } else {
            System.out.println("La habitación " + numeroHabitacion + " ya está ocupada.");
        }
    }

    public void cancelarReserva() {
        if (ocupada) {
            System.out.println("Reserva cancelada para la habitación " + numeroHabitacion);
            ocupada = false;
        } else {
            System.out.println("La habitación " + numeroHabitacion + " no está ocupada para cancelar la reserva.");
        }
    }
}
