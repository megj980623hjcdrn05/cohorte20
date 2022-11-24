package ejecutar;

import clases.MiClase;
import misClases.Animal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiClase mc = new MiClase(14689, "adios");
		
		mc.metodo();
		
		Animal miAnimal = new Animal("Falco");
		miAnimal.setEdad(3);
		System.out.println("el nombrees: " + miAnimal.getNombre());
		System.out.println("y tiene "+ miAnimal.getEdad() + " anos");
		
		
		
		
	}
	
	


}
