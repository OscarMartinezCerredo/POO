package poo;

public class estudiantes {
private String nombre;
private int edad;
private double calificacion;

public estudiantes() {
	nombre=null;
	edad = 20;
	calificacion =4.9;
	
}
public void establece_nombre() {
	nombre = "Paco";
}
public String dime_nombre() {
	return nombre;
}
public void establece_edad() {
	edad = 30;
}
public int dime_edad() {
	return edad;
}
public void establece_calificacion() {
	calificacion = 5;
}
public double dime_calificacion() {
	return calificacion;

}
public void setEdad(int nuevaEdad){
	if (edad >=0) {
		edad = nuevaEdad;
	}else {
		System.out.println("no puede ser negativo");
	}
	
	
	}
public void setCalificacion(double calificacion) {
	if (calificacion >=0 && calificacion <= 100) {
		calificacion = calificacion;
	}else {
		System.out.println("la calificacion esta en el rango de 0 al 100 ");
	}
}

}
