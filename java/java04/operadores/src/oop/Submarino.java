package oop;

public class Submarino {
	
	static void subMenu() {
		Menu m = new Menu();
		OperacaionesAritmeticas oa= new OperacaionesAritmeticas();	
		
		do {			

		switch (m.subMenuOp()) {
		case 1:{
			System.out.println(oa.add()); 
			break;
		}
		case 2:{
			System.out.println(oa.sustrac());
			break;
		}	
		case 3:{
			System.out.println(oa.producto());
			break;	
		}
		case 4:{
			System.out.println(oa.divide());
			break;
		}
		case 5:{
			System.out.println(oa.modulo());
			break;
		}
		case 6:{
			System.out.println("soy el caso 6");
			break;
		}
		default:
			break;
		}
		
		} while (m.subMenuOp()!=7);
	
	}
	
	
	
	public static void main(String[] args) {
		Submarino.subMenuOp();
		
		
		
		
	}
}
