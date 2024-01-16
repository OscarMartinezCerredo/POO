package poo;

public class clasbanco {
private String titular;
 private double saldo;
 
 
public clasbanco() {
	 titular = "humano";
	 saldo =80.0;
 }
public void establece_titular() {
	titular ="Paco";
}
public String dimeTitular(){
	return "el titular es "+titular;
}
public void establece_saldo() {
	saldo =89.0;
}
public double dimeSaldo() {
	return saldo;
}
public void setSaldo(double nuevoSaldo) {
	if (nuevoSaldo >= 0) {
		saldo = nuevoSaldo;
	}else {
		System.out.println("no puede ser menor a cero");
	}
	
	}
public void setTitular (String titular) {
	titular = titular;
}
}
