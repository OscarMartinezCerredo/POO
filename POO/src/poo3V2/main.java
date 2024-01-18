package poo3V2;

public class main {

		


	    public static void main(String[] args) {
	        
	        Hotel miH = new Hotel(10);

	       
	        System.out.println("Disponibilidad inicial:");
	        miH.mostrarDisponibilidad();

	     
	        miH.reservarHabitacion(3);
	        miH.reservarHabitacion(7);
	        miH.reservarHabitacion(1);

	      
	        System.out.println("\nDisponibilidad después de las reservas:");
	        miH.mostrarDisponibilidad();

	       
	        miH.cancelarReservaHabitacion(3);

	        
	        System.out.println("\nDisponibilidad después de cancelar la reserva:");
	        miH.mostrarDisponibilidad();
	    }
	}

