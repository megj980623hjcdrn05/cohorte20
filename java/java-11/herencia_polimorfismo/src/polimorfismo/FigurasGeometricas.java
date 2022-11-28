package polimorfismo;

public abstract class FigurasGeometricas {
	//protected double pValor;
	//protected double sValor;
	protected double resultado;
//    Scanner s;
	public abstract void pedirDatos();
//	{
//		s = new Scanner(System.in);
//		System.out.print("Introduzca el primer valor: ");
//		pValor  = s.nextDouble();
//		
//		System.out.print("Introduzca el segundo valor: ");
//		sValor = s.nextDouble();
//	}
	
	public abstract void area();
	
	public void visualizar () {
		System.out.println("El resultado del area es: " + resultado);
	}
}
