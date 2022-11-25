package mis_clases.exepciones.operacion;

public class Division {
	private int numerador;
	private int denominador;
	public Division(int numerador, int denominador) throws OpExcep{
		if (denominador == 0) {
			throw new OpExcep("el denominador es zero");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizar () {
		System.out.println("Resultado de la division "+ this.numerador/this.denominador);
	}
}
