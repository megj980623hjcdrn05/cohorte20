package oop;

import java.util.Scanner;

public class Menu {
	Scanner s = new Scanner(System.in);
	int menuOp () {
		int numero = 0;
	System.out.println("\t\t ------- Menu principal--------");
	System.out.println("1: tablas");
	System.out.println("2: operaciones arit");
	System.out.println("3: mu");
	System.out.println("4: d");
	System.out.println("5: m");
	System.out.println("6: bo");
	
	System.out.println("introduzaca una opcion");
	
	
	
	return numero = s.nextInt();
	
	
	}

	
	int subMenuOp () {
		int numero = 0;
	System.out.println("\t\t ------- Menu Operaciones Aritmeticas--------");
	System.out.println("1: suma");
	System.out.println("2: resta");
	System.out.println("3: multi");
	System.out.println("4: div");
	System.out.println("5: mod");
	System.out.println("6: booleans");
	System.out.println("7: salir");
	
	
	System.out.println("introduzaca una opcion:");
	
	
	
	return numero = s.nextInt();
	
	
	}
}
