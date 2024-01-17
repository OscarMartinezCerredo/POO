package poo3;

public class Horas {
private int tiempo;
private int horas;
private int minutos;
 // por separado 

public Horas(int horas,int minutos){ // necesitos los dos 
	establecerHoras_minutos(horas,minutos);{
		
	}
}
public void  establecerHoras_minutos(int horas, int minutos) { // necesita por separado 
	if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60) {
        this.tiempo = horas * 100 + minutos; 
}else {
	System.out.println("no es una hora");
}
}
public void establecer_horas( int horas){
	this.horas = horas ;
}
public int dimehoras(){
	 return horas ;
}
public void establecer_minutos( int minutos){
	this.minutos = minutos ;
}
public int dimeminutos(){
	 return minutos ;
}
public int obtenerHoras() {// da una 
	return tiempo/100;
}
public int obtenerMinutos() { // da una 
	return tiempo%100;
}
public int obtenTiempo() { // da las dos juntas 
	return tiempo;
}

}