package poo3v3;

public class mainrece {
	 public static void main(String[] args) {
	       ClassReceta miReceta = new ClassReceta();

	        miReceta.agregarIngredientes("Harina");
	        miReceta.agregarIngredientes("Azúcar");
	        miReceta.agregarIngredientes("Huevos");

	        miReceta.agregarPasos("Mezclar los ingredientes secos.");
	        miReceta.agregarPasos("Añadir los huevos y mezclar bien.");
	        miReceta.agregarPasos("Hornear a 180°C durante 30 minutos.");

	        miReceta.muestraReceta();
	    }
	}

