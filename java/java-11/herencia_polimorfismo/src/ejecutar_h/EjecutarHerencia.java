package ejecutar_h;

import herencia.Hija;
import herencia.Padre;

public class EjecutarHerencia {
	public static void main(String[] args) {
		Padre p = new Padre("juan", "pachuca");
		p.mostrarDatos();
		
		Hija h = new Hija("Dora", "CDMX", 20);
		h.mostrarDatos();
		
		Hija h2 = new Hija("Diego", "Tulancingo", 18);
		h2.mostrarDatos("Cruz");
				
	}
}
