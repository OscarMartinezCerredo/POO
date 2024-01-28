package poo3v3;

import java.util.ArrayList;

public class ClassReceta {
	  private ArrayList<String> listaIngredientes;
	  private ArrayList<String> listaPasos; // lista dinamica mejor de hast ya que no hay que comparar y asi no ponemos limite y le decimos que entra String 
	
	public ClassReceta(){
		this.listaIngredientes = new ArrayList<String>();//inicializamos que la lista se guarde en lista de pasoss
		this.listaPasos = new ArrayList<String>(); //inicializamos que la lista se guarde en lista de pasoss
	}
	public void agregarIngredientes(String ingrediente) {
		listaIngredientes.add(ingrediente); //añade ingredientes a la lista
	}
	public void eliminarIngredientes(String ingrediente) {
		listaIngredientes.remove(ingrediente); //quita ingredientes a la lista 
	}
	public void agregarPasos(String pasos) {
		listaPasos.add(pasos); // añade pasos al arraid 
	}
	public void muestraReceta() {
		System.out.println("Esta es la receta");
		System.out.println("estos son los ingredientes ¡");
		for (String ingrediente : listaIngredientes) {
            System.out.println("- " + ingrediente);
        }
		for (int i =0;i<listaPasos.size();i++) { // recorre el arraid de lista de paso sumando por delnate 1 mas (1+quemar la carne)
			System.out.println((i+1)+""+ listaPasos.get(i));
		}
		
	}
}
