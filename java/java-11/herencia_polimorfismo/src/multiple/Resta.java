package multiple;

public class Resta implements OperacionesAritmeticas, Operaciones{
	private double pValor;
	private double sValor;
	
	public Resta(double pValor, double sValor) {
		this.pValor = pValor;
		this.sValor = sValor;
	}
	
	@Override
	public void mensajes() {
		// TODO Auto-generated method stub
		System.out.println("valores " + pValor + " " + sValor);
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Restar() {
		// TODO Auto-generated method stub
		return pValor - sValor;
	}

}
