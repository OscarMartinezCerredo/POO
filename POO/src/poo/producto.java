package poo;

public class producto {
 private String nombre;
 private double precio;
 private int stock;
 
 public producto() {
	 nombre = null;
	 precio = 20.2;
	 stock = -2;
	 
 }
 public void establece_nombre (){
	 nombre = "Paco";
 }
 public String dime_nombre(){
	 return "el nombre es"+nombre;
 }
 
 public void establece_precio() {
	 precio = 20.5;
 }
 public double dime_precio() {
	 return precio;
 }
 public String setstock(int stock) {
	 if (stock >=0) {
		return "el stock es" + stock ;
	 }else {
		 System.out.println("no puede ser negativo");
	 }
	return null;

 }
 
 
 public void establece_stock(){
	 stock = 34;
 }
 public int dime_stock() {
	 return stock;
}

}