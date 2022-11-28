package ejecutar_abs;


import java.awt.Rectangle;

import polimorfismo.*;

public class EjecutarABS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigurasGeometricas t = new Triangulo();
		FigurasGeometricas c = new Cuadrado();
		FigurasGeometricas cir = new Circulo();
		FigurasGeometricas r = new Rectangulo();
		
		t.pedirDatos();
		t.area();
		t.visualizar();
		
		c.pedirDatos();
		c.area();
		c.visualizar();
		
		cir.pedirDatos();
		cir.area();
		cir.visualizar();
		
		r.pedirDatos();
		r.area();
		r.visualizar();
		
	}

}
