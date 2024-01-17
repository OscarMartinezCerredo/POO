package poo;

public class cochemain {
public static void main(String[] args) {
	/*
	coche Renault = new coche();
	//System.out.println("mi coche tiene " + Renault.rueda + " ruendas " + " ,el coche tiene m de largo "+Renault.largo + " ti");
	
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
     //coche*/
     //System.out.println(Renault.dime_motor());
     
	coche Subaru = new coche();
     Subaru.establece_color("Verde");
     System.out.println(Subaru.dime_datos_generales());
    Subaru.configura_asientos("si");
    System.out.println(Subaru.dime_asientos());
     
     
     
     
     
     
     
     
     
     
     
     /*
     
     // automovil 
     automovil auto = new automovil();
     auto.SetMarca("SUBARU");
     auto.SetModelo("nose");
     System.out.println("1 "+auto.dime_modelo());
     System.out.println("1 "+auto.dime_marca());
     auto.establecer_modelo();
     auto.establece_marca();
     
     
     //banco
     clasbanco banco = new clasbanco();

    System.out.println("2 "+banco.dimeSaldo());
    System.out.println("2 "+banco.dimeTitular());
    banco.setSaldo(-500);
    banco.setTitular("PACO");
    System.out.println("2 "+banco.dimeSaldo());
    //
     estudiantes estudiante = new estudiantes();
     estudiante.establece_nombre();
      estudiante.establece_edad();
      estudiante.establece_calificacion();
     estudiante.setEdad(300);
     estudiante.setCalificacion(120);
     System.out.println("3 "+estudiante.dime_calificacion());
     System.out.println("3 "+estudiante.dime_edad());
     System.out.println("3 "+estudiante.dime_nombre());
     
    //
    producto productov1 = new producto();
    productov1.establece_precio();
    int stock=  productov1.dime_stock();
    productov1.establece_nombre();
    System.out.println("4 "+productov1.dime_nombre());
    System.out.println("4 "+productov1.dime_precio());
    System.out.println("4 "+productov1.dime_stock());
    System.out.println(productov1.setstock(stock));
    //*/
}

}
