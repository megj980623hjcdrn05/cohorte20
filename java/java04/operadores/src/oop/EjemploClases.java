package oop;

public class EjemploClases {
	
	
	static void cambio () {
		
		
		Tablas t = new Tablas();
		Menu m = new Menu ();
		Submarino sm = new Submarino();
		
		int numero = m.menuOp();
		switch (numero) {
		case 1: {
			
			t.tabla();
			break;
		}
		case 2 : {
			sm.submenu();
			break;
		}
		default:
			break;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EjemploClases.cambio();
	
		
	}

}
