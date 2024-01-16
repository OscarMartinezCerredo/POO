package poo;

public class coche {
private int rueda;
private int largo;
private int ancho;
private int motor;
private int peso;
String color;
boolean asientos_cuero,climatizador;

// primero el public class coche y luego el public metodos con el mismo nombre con el valor de las variables 
public coche(){
	ancho=250;
	largo=400;
	rueda=4;
	motor=200;
	peso =1900;
	color = null;
	asientos_cuero = true;
	climatizador = true ;
}
public String dime_motor() {
return "El motor del coche tiene " + motor + " caballos de potencia";
}
public void establece_color() {
	color ="Rojo";
}
public String  dime_color() {
	return "el color es " + color ;
}

}