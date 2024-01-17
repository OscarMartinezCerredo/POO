package poo3;

import java.util.Scanner;

public class main {
// por separad o
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Relojclass Reloj = new Relojclass();
   Scanner scanner = new Scanner(System.in);

  
   Horas h = new Horas(20,10);
   // hora de a hora establecer
    h.establecer_horas(scanner.nextInt());
    h.establecer_minutos(scanner.nextInt());
    h.establecerHoras_minutos(h.dimehoras(), h.dimeminutos()); //establecer cosas 
    
    
    //decir cosas 
   System.out.println(h.obtenTiempo());
    Reloj.establece_hora(h.obtenTiempo());
   System.out.println(Reloj.dimeh_hora()); 
   // la alarma establecer 
   h.establecer_horas(scanner.nextInt());/// establecer cosas 
   h.establecer_minutos(scanner.nextInt());
  
  h.establecerHoras_minutos(h.dimehoras(), h.dimeminutos());//decir cosas 
  Reloj.establece_alarma(h.obtenTiempo());
  System.out.println(Reloj.dimeh_alarma());
  // alarma activada ? 
  System.out.println("quieres activar la alarma");
  Reloj.activar_alarma(scanner.next());
  System.out.println(Reloj.dimesiacti());
  // alarma sonando 
   
   System.out.println(Reloj.dimeh_alarma());
   System.out.println(Reloj.dimeh_hora());
  
   Reloj.com_alarma(Reloj.dimeh_alarma(), Reloj.dimeh_hora());
   System.out.println(Reloj.encen());
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 /*  //horas
   System.out.println("dime la hora de la alarma");
   Reloj.establece_alarma(scanner.nextInt()); //
   System.out.println(Reloj.dimeh_alarma()); 
   //minutos 
   System.out.println("dime la hora de la alarma");
   Reloj.establece_alarma(scanner.nextInt());
   System.out.println(Reloj.dimeh_alarma());
   
   System.out.println("dime que hora es ");
   Reloj.establece_hora(scanner.nextInt());
   System.out.println(Reloj.dimeh_hora());
   
   
   System.out.println("dime si quieres poner la alarma");
   Reloj.activar_alarma(scanner.next());
   System.out.println(Reloj.dimesiacti());
   
   
   
   Reloj.com_alarma(Reloj.dimeh_alarma(), Reloj.dimeh_hora());
   System.out.println(Reloj.encen());
   */
	
	}

}
