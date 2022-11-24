package operadores;

import java.util.Scanner;

public class Ciclos {
	
	 void saludo() {
		System.out.println("hola a las funciones en java ");
		
	}
	
	int operacion () {
		int f = (int) Math.pow(3, 2);
		return f; 
	}
	
	static float nuevo() {
		
		
		return 0;
	}
	
	String caracteres() {
		String nombre = " ";
		return nombre;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciclos objC = new Ciclos();
		
		objC.saludo();
		System.out.println("uso de pow()" + objC.operacion());
		
		nuevo();
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("\t\t\tintroduzca el valor de la tabla de multiplcar --->");
//		
//		int tabla = scanner.nextInt();
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(tabla + " * " + i + " = " + tabla*i);
//		}
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("\t\t\tintroduzca el valor de la tabla de multiplcar --->");
		int j = 1;
		int tabla2 = scanner2.nextInt();
		while(j <= 10) {
			System.out.println(tabla2 + " * " + j + " = " + tabla2*j);
			j++;
		}
		
		
		
		
		
		
		
	}
}
