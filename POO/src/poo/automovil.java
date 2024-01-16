package poo;

public class automovil {
private String marca;
private String modelo;



public automovil(){
	marca = null;
	modelo = null;
}
public void establece_marca() {
	marca ="Seat";
}
public String dime_marca() {
	return "la marca es "+ marca;
}
public void establecer_modelo() {

		modelo = "v1";

}
public String dime_modelo() {
	return "el modelo es "+modelo;
}
public void SetModelo(String NuevoModelo) {
	modelo = NuevoModelo;
	
}
public void SetMarca(String NuevoMarca) {
	if (NuevoMarca != null) {
		marca = NuevoMarca;
	}else {
		System.out.println("no puede ser null");
	}
}
}
