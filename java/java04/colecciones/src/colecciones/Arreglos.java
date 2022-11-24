package colecciones;

import java.util.Arrays;
import java.util.Iterator;

public class Arreglos {
	public static void main(String[] args) {
		//arrays 
		//solo un tipo de dato
		//especificar tamano
		
		String [] miArreglo = new String[5];
		
		miArreglo[0] = "juan";
		miArreglo[1] = "juan";
		miArreglo[2] = "juan";
		miArreglo[3] = "juan";
		miArreglo[4] = "juan";
		
		
		System.out.println(miArreglo[0]);
		
		//for
		
		for(int i=0; i<miArreglo.length; i++) {
		System.out.println("ciclo for: " + miArreglo[i]);
		}
		
		//forEach
		for (String nombre : miArreglo) {
			System.out.println("For Each: " + nombre);
		}
		
		//Math.pow(2, 2);
		//Arrays
		
		System.out.println(Arrays.toString(miArreglo));
		
		//Tipos de valores
		int numeros [] = new int [5];
		
		numeros[0]=3;
		numeros[1]=-56;
		numeros[2]=(int) 3.45;//casteo == cambiar tipo de valor
		numeros[3]=Integer.parseInt("2"); //parseo == cambiar la clase de valor
		
		for (int numero : numeros) {
			System.out.println("valores del array numeros: " + numero);
			
			
		}
		
		
		//arreglos de objectos
		
		Persona persona1 = new Persona("Pancho", 30);
		Persona persona2 = new Persona("Paty", 30);
		
		//
		Persona [] arrPersonas = new Persona[3];
		arrPersonas[0]= persona1;
		arrPersonas[1]= persona2;
		arrPersonas[2] = new Persona("Luis", 18);
		System.out.println(arrPersonas[0].nombre);
		System.out.println(arrPersonas[1].nombre);
		System.out.println(arrPersonas[2].nombre);
		
		for (Persona persona : arrPersonas) {
			System.out.println("Nombre: " + persona.nombre + "Edad: " + persona.edad);
			
			
		}
		
		//arreglos literales
		String[] arrString = {"manzana", "Pera"}
		System.out.println(Arrays);
		
	}
}
