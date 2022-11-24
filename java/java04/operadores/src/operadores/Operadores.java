package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		var scanner = new Scanner(System.in);
//		//System.out.println("----- Da un dato----");
//		//String dato = scanner.nextLine();
//		//System.out.println("El dato es :" + dato);
//		
//		int valor = 6;
//		int valor0 = 7;
//		
//		int suma = valor + valor0;
//		System.out.println("suma: "+ suma);
//		
//		int resta = valor - valor0;
//		System.out.println("resta: "+ resta);
//		
//		int div = valor / valor0;
//		if (valor0 != 0) {
//			System.out.println("div: "+ div );
//
//		}else {
//			System.out.println("el es 0");
//		}
//	
//		
//		int modulo = valor % valor0;
//		System.out.println("modulo: "+ modulo);
		
//		System.out.println("----- Ejercicio----");
//		
//
//
//		System.out.println("---inserta num1");
//		int num1 = scanner.nextInt();
//		System.out.println("---inserta num2");
//		int num2 = scanner.nextInt();
//		
//		int sum = num1 + num2;
//		System.out.println("suma: " + sum);
//		
//		System.out.println("----- resta----");
//		int res = num1 - num2;
//		System.out.println("resta: " + res);
//		
//		System.out.println("----- multiplicacion----");
//		int mul = num1 * num2;
//		System.out.println("multiplicaion: " + mul);
//		
//		System.out.println("----- divicion----");
//		
//		if (num2 != 0) {
//			int divi = num1 / num2;
//			System.out.println("div: "+ divi );
//
//		}else {
//			System.out.println("el denominador es 0");
//		}
//		
//		System.out.println("----- modulo----");
//		
//		int mod = num1 % num2;
//		System.out.println("mod: "+ mod );
//		if (mod == 0) {
//			System.out.println("el numero es un par");
//		
//		} else {
//			System.out.println("el numero no es un par");
//		}
		
//		int a =3;
//		int b =5;
//		boolean comparar = a>=b;
//		boolean logica = true;
//		if (logica && comparar) {
//			System.out.println("hola true");
//			System.out.println("comparar: " + comparar);
//		}else {
//			System.out.println(comparar);
//			System.out.println(logica);
//		}
//		
//		int number = 1;
//		String msj = "";
		
		
		
		
//		System.out.println("\t\t ------- Menu--------");
//		System.out.println("1: suma");
//		System.out.println("2: resta");
//		System.out.println("3: multi");
//		System.out.println("4: div");
//		System.out.println("5: mod");
//		System.out.println("6: booleans");
//		
//		System.out.println("introduzaca una opcion");
//		
//		int option = scanner.nextInt();
//		
//		switch(option) {
//		case 1: 
//			System.out.println("---inserta num1");
//			int num1 = scanner.nextInt();
//			System.out.println("---inserta num2");
//			int num2 = scanner.nextInt();
//			
//			int sum = num1 + num2;
//			System.out.println("suma: " + sum);
//			System.out.println("uno");
//			break;
//		case 2:
//			System.out.println("---inserta num1");
//			int num1 = scanner.nextInt();
//			System.out.println("---inserta num2");
//			int num2 = scanner.nextInt();
//			int res = num1 - num2;
//			System.out.println("resta: " + res);
//			
//			System.out.println("dos");
//			break;
//		case 3:
//			System.out.println("---inserta num1");
//			int num1 = scanner.nextInt();
//			System.out.println("---inserta num2");
//			int num2 = scanner.nextInt();
//			
//			int mul = num1 * num2;
//			System.out.println("multiplicaion: " + mul);
//			
//			
//			System.out.println("tres");
//			break;
//			
//		case 4:
//			System.out.println("---inserta num1");
//			int num1 = scanner.nextInt();
//			System.out.println("---inserta num2");
//			int num2 = scanner.nextInt();
//			
//			
//			
//			
//			System.out.println("tres");
//			break;	
//			
//		case 5:
//			System.out.println("---inserta num1");
//			int num1 = scanner.nextInt();
//			System.out.println("---inserta num2");
//			int num2 = scanner.nextInt();
//			
//			if (num2 != 0) {
//				int divi = num1 / num2;
//				System.out.println("div: "+ divi );
//	
//			}else {
//				System.out.println("el denominador es 0");
//			}
//			
//			
//			System.out.println("tres");
//			break;	
//			
//		case 6:
//			System.out.println("---inserta num1");
//			int num1 = scanner.nextInt();
//			System.out.println("---inserta num2");
//			int num2 = scanner.nextInt();
//			
//			int mod = num1 % num2;
//			System.out.println("mod: "+ mod );
//			if (mod == 0) {
//				System.out.println("el numero es un par");
//			
//			} else {
//				System.out.println("el numero no es un par");
//			}
//			
//			
//			
//			System.out.println("tres");
//			break;	
//			default:
//				break;
//				
//				
//				
//		}
		int numero = 0;
		do {
		System.out.println("\t\t ----- Menu-----");
		System.out.println(" 1: Suma");
		System.out.println(" 2: Resta");
		System.out.println(" 3: Multiplicacion");
		System.out.println(" 4: Division");
		System.out.println(" 5: Modulo");
		System.out.println(" 6: Booleans");
		System.out.println(" 7: Salir");
	
		System.out.println(" introduzca la opcion");
		numero = scanner.nextInt();	
	
		switch(numero){
		case 1:
			 System.out.println("uno");
			 System.out.println("\t----Suma---");
				System.out.print("introduzca un numero ");
				int datosS = scanner.nextInt();
				System.out.print("introduzca un numero ");
				int datosSu = scanner.nextInt();		
				int suma = datosS + datosSu;
				System.out.println("Suma: " + suma);
			 break;
		case 2:
			System.out.println("\t----Resta---");
			System.out.print("introduzca un numero ");
			int datosR = scanner.nextInt();
			System.out.print("introduzca un numero ");
			int datosRe = scanner.nextInt();		
			int rest = datosR - datosRe;
			System.out.println("Rest: " + rest);
			System.out.println("dos");
			break;
		case 3: 
			System.out.println("\t----Multiplicacion---");
			System.out.print("introduzca un numero ");
			int datosM = scanner.nextInt();
			System.out.print("introduzca un numero ");
			int datosMu = scanner.nextInt();		
			int mult = datosM * datosMu;
			System.out.println("Mult: " + mult);
			System.out.println("tres");
			break;
		case 4:
			System.out.println("\t----Division---");
			
			System.out.print("introduzca un numero ");
			int datosD = scanner.nextInt();
			System.out.print("introduzca un numero ");
			int datosDi = scanner.nextInt();
			
			if (datosDi != 0) {
				int div = datosD / datosDi;
				System.out.println("Div: " + div);			
			} else {
				System.out.println(" el denominador es cero");
			}
			
			break;
		case 5:
			
			System.out.println("\t----Modulo---");
			System.out.print("introduzca un numero ");
			int datosMo = scanner.nextInt();
			System.out.print("introduzca un numero ");
			int datosMod = scanner.nextInt();		
			int modulo = datosMo % datosMod;
			System.out.println("Modulo: " + modulo);
			if (modulo == 0) {
				System.out.println("El numero es un par");
			} else {
				System.out.println("El numero no es par ");
			}
			
			break;
		case 6:
			int a = 3;
			int b =5;
			boolean comparar= a >= b;
			boolean logica = false;
			if (!comparar || !(logica)) {
				System.out.println("hola si soy verdadero ");
				System.out.println(" comparar: " + comparar);			
			} else {
				System.out.println(comparar);
				System.out.println(logica);
			}
		case 7:
			System.out.println("bye");
			default:
				break;
			
		}
	
			System.out.println("loop do while");
			System.out.println(numero);
			
		} while ( numero != 7);
		
		
	}

}