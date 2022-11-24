package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte, short, int, long
		
		byte numeroB = 127;
		System.out.println("Tamano de un byte " + Byte.SIZE);
		System.out.println("valor maximo " + Byte.MAX_VALUE);
		System.out.println("valor minimmo" + Byte.MIN_VALUE);
		
		System.out.println("---------");
		int entero = 5;
		System.out.println("tamano de un entero " + Integer.BYTES);
		System.out.println("tamano" + Integer.SIZE);
		System.out.println("valor max" + Integer.MAX_VALUE);
		System.out.println("valor min" + Integer.MIN_VALUE);
		System.out.println("el valor del entero" + entero);
		
		System.out.println("-----short----");
		System.out.println("tamano de un short " + Short.SIZE);
		System.out.println("tamano bytes short " + Short.BYTES);
		System.out.println("valor max " + Short.MAX_VALUE);
		System.out.println("valor min " + Short.MIN_VALUE);
		
		System.out.println("-----long----");
		System.out.println("tamano de un long " + Long.SIZE);
		System.out.println("tamano bytes long " + Long.BYTES);
		System.out.println("valor max " + Long.MAX_VALUE);
		System.out.println("valor min " + Long.MIN_VALUE);
	
		var num = 12;
		var sistemNum = 0XFC;
		
		System.out.println("---> " + sistemNum);
		System.out.println("-----primitivos float, double------");
		
		System.out.println("-----float----");
		System.out.println("tamano de un float " + Float.SIZE);
		System.out.println("tamano bytes float " + Float.BYTES);
		System.out.println("valor max " + Float.MAX_VALUE);
		System.out.println("valor min " + Float.MIN_VALUE);
		
		System.out.println("-----double----");
		System.out.println("tamano bits de un double " + Double.SIZE);
		System.out.println("tamano bytes double " + Double.BYTES);
		System.out.println("valor max " + Double.MAX_VALUE);
		System.out.println("valor min " + Double.MIN_VALUE);
		
		float coma = 100.10F;
		var comaD = 1000.10E23;
		System.out.println("---> float " + coma);
		
		System.out.println("---> double " + comaD);
		
		var estado = true; //false
		System.out.println("--->: " + estado);
		System.out.println("---> Boolean false " + Boolean.FALSE);
		System.out.println("---> Boolean true " + Boolean.TRUE);
		
		var edad = 20;
		//var adulto = edad >= 10;
		
		if (edad >= 10) {
			System.out.println(
					"---> : varBool si edad es mayor igual a 10> " + edad);
		}else {
			System.out.println(
					"---> : varBool la edad es menor a >" + edad);
		}
		
		System.out.println("------char-----" );
		
		//char caracter = "halo".charAt(2);
		char caracter = '\u06DE';
		System.out.println("----> " + caracter);
		
	}

}
