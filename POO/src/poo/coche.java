package poo;

public class coche {
private int rueda,largo,ancho,motor,peso, peso_plataforma;
 private String color;
private boolean asientos_cuero,climatizador;


// primero el public class coche y luego el public metodos con el mismo nombre con el valor de las variables 
public coche(){
	ancho=250;
	largo=4000;
	rueda=4;
	motor=200;
	peso =1900;
	color = null;
	asientos_cuero = true;
	climatizador = true ;
	peso_plataforma = 200;
}
public String dime_motor() {
return "El motor del coche tiene " + motor + " caballos de potencia";
}
/*
public void establece_color() {
	color ="Rojo";
}*/
public void establece_color(String color_coche) {
	color =color_coche;
}
public String  dime_color() {
	return "el color es " + color ;
}
public String dime_datos_generales() {
	return " La plataforma del coche " + rueda+" ruedas "+"mide "+largo/1000+ " metros con un acho de "+ancho+" centimetros y un peso plataforma de "+peso_plataforma +" kg";
}
public void configura_asientos(String asientos_cuero) {
	
	if (asientos_cuero=="si") {
		 this.asientos_cuero =true;
	}else {
		this.asientos_cuero =false;
	}
	
		
	}
    public String dime_asientos() {
    
    	if (asientos_cuero) {
	return "el coche tiene asientos de cuero";
    }else {
    	return "tus asientos son de pena";
    }
}

}