package poo;

public class cochemain {
public static void main(String[] args) {
	
	coche Renault = new coche();
	System.out.println("mi coche tiene " + Renault.rueda + " ruendas " + " ,el coche tiene m de largo "+Renault.largo + " ti");
	
	Lampara faro = new Lampara();
	System.out.println(faro.color + faro.potencia + faro.tipo);
	 
     Libro Com = new Libro();
     System.out.println(Com.autor+Com.numPaginas+Com.titulo);
     
     bicicleta bici = new bicicleta();
     System.out.println(bici.numRuedas+bici.tamaño+bici.tipo);
     
     Reloj reloj = new Reloj();
     if (reloj.digital==true) {
    	 System.out.println("digital"+ reloj.precio);
     }
     Celular celular = new Celular();
     System.out.println(celular.modelo+celular.almacenamiento);
     
     
}
}
