package poo3;

import java.util.Scanner;

public class main {
// por separad o
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Relojclass Reloj = new Relojclass();
   Scanner scanner = new Scanner(System.in);

  
   Horas h = new Horas(20,10); // valores preterminado que ahora da un poco igual 
   // hora de a hora establecer
   System.out.println("dime la hora");
    h.establecer_horas(scanner.nextInt()); // valor de hora por separado  que pasa a el objeto hora 
    System.out.println("dime los minutos");
    
    h.establecer_minutos(scanner.nextInt()); // valor de minutos por separado 
   
    h.establecerHoras_minutos(h.dimehoras(), h.dimeminutos()); //establecer cosas  los junta y los establece como horas y minutos 
    
    //decir cosas 
   System.out.println(h.obtenTiempo()); // me dice la hora tengo que mejorar como se muestra ya que se muestra como 4 digitos 
    Reloj.establece_hora(h.obtenTiempo()); // estable el la horea en el que lo puesto
   System.out.println(Reloj.dimeh_hora());  // me dice la hora 
   // la alarma establecer 
   
   System.out.println("dime la hora");
   h.establecer_horas(scanner.nextInt());/// establecer cosas las horas por separado 
   System.out.println("dime los minutos");
   h.establecer_minutos(scanner.nextInt()); // me establece los minutos 
  
  h.establecerHoras_minutos(h.dimehoras(), h.dimeminutos());// une horas y minutos 
  Reloj.establece_alarma(h.obtenTiempo()); // establece el tiempo junto como alarma 
  System.out.println(Reloj.dimeh_alarma()); // me dice la hora de la alarma 
  // alarma activada ?
     7
  System.out.println("quieres activar la alarma"); //pregunta 
  Reloj.activar_alarma(scanner.next());  // mete dato 
  System.out.println(Reloj.dimesiacti()); // establece dato de alarma activa o no 
  // alarma sonando 
   
   System.out.println(Reloj.dimeh_alarma()); //me dice alarma 
   System.out.println(Reloj.dimeh_hora()); // dice hora 
  
   Reloj.com_alarma(Reloj.dimeh_alarma(), Reloj.dimeh_hora()); // establece hora comparar alarma y hora
   System.out.println(Reloj.encen()); // decir cosas 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
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
