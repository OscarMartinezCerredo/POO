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
public void establece_alarma(int hora_alarma) {
	
	this.hora_alarma=hora_alarma;//dos juntos 
}
 public int dimeh_alarma() {
	 return hora_alarma;//dos juntos
 }
 public void establece_hora(int hora_actual) {
		
		this.hora_actual=hora_actual; // dos juntos 
	}
	 public int dimeh_hora() {
		 return hora_actual;//dos juntos
	 }
	 
	 public void activar_alarma(String alarma_acti) {
		 if ("si".equals(alarma_acti)) {
			 this.alarma_acti= true;
		 }else {
			 this.alarma_acti=false;
		 }
	 }
	 public String dimesiacti() {
		 if(alarma_acti) {
			 return "la alarma esta encendida";
		 }else {
			 return "la alarma no esta encendida";
		 }
	 }
	 
	 
	 
	 public void com_alarma(int hora_alarma,int hora_actual) {
		 if (hora_alarma == hora_actual&&alarma_acti) {
		 this.alarma_sonado = true;
	 }else {
		  this.alarma_sonado = false;
	 }
		
	 }
	 public String encen() {
		 if (alarma_sonado) {
			 return "Sondando";
		 }else {
			 return "no esta sonando";
		 }
}
		 
	 
	 
}
