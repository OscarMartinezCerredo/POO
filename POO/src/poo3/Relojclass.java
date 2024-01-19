package poo3;

public class Relojclass {
private int hora_alarma,hora_actual;
private boolean alarma_acti,alarma_sonado;



public Relojclass() {
	// tienen que venir juntas 
	
//por separado
	
   Horas h = new Horas(20,30);
	hora_alarma= 2030 ;//dos juntas 
	
	hora_actual=2030;//dos juntas */
	alarma_acti = true;
	alarma_sonado =true;
}
public void establece_alarma(int hora_alarma) { //  el valor de la alarma 
	
	this.hora_alarma=hora_alarma;//dos juntos 
}
 public int dimeh_alarma() { // me dice la alarma establecida
	 return hora_alarma;//dos juntos
 }
 public void establece_hora(int hora_actual) {
		
		this.hora_actual=hora_actual; // dos juntos // el valor de la hora actual 
	} 
	 public int dimeh_hora() {
		 return hora_actual;//dos juntos // me dice que hora es 
	 }
	 
	 public void activar_alarma(String alarma_acti) { // activa la alarma si esta desativada 
		 if ("si".equals(alarma_acti)) {
			 this.alarma_acti= true;
		 }else {
			 this.alarma_acti=false;
		 }
	 }
	 public String dimesiacti() { //dice si esta encendida o apagada 
		 if(alarma_acti) {
			 return "la alarma esta encendida";
		 }else {
			 return "la alarma no esta encendida";
		 }
	 }
	 
	 
	 
	 public void com_alarma(int hora_alarma,int hora_actual) { //compara la hora de la alarma y la hora actual 
		 if (hora_alarma == hora_actual&&alarma_acti) { // comparacion 
		 this.alarma_sonado = true;
	 }else {
		  this.alarma_sonado = false;
	 }
		
	 }
	 public String encen() { // dice si esta sonando 
		 if (alarma_sonado) {
			 return "Sondando";
		 }else {
			 return "no esta sonando";
		 }
}
		 
	 
	 
}
