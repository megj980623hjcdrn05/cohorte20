package mis_clases.exepciones.ejecuta;

import mis_clases.exepciones.operacion.Division;
import mis_clases.exepciones.operacion.OpExcep;

public class TestExcep {
	public static void main(String[] args) {
	try {
		Division d = new Division (4,0);
		//d.visualizar();
		
	} catch (OpExcep e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}
	System.out.println("continua...");
		
		
		
	}
	}