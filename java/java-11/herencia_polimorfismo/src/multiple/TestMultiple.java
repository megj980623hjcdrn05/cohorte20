package multiple;

public class TestMultiple {
public static void main(String[] args) {
	Suma suma = new Suma(5, 5);
	OperacionesAritmeticas oa = new Suma(10, 5);
	Operaciones o = new Suma(3,2); 
	o.mensajes();
	System.out.println("obj oa: " + oa.sumar()); 
	System.out.println("la suma es: " + suma.sumar());
	suma.mensajes();
}
}
