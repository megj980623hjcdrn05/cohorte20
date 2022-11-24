package colecciones;

import java.util.*;

public class Colecciones {
	public static void main(String[] args) {
		//list - ArrayList
		
		System.out.println("---ArrayList---");
		
		List<String> miArray = new ArrayList<String>();
		
		miArray.add("GDL");
		miArray.add("CDMX");
		miArray.add("MTY");
		miArray.add(1, "Manzanillo");
		
		String valorQuitado = miArray.remove(0);
		//boolean valorQuitado = miArray.remove("GDL");
		
		System.out.println(miArray);
		System.out.println(valorQuitado);
		System.out.println(miArray.size());
		
		imprimir(miArray);
		
		System.out.println("---HashSet---");
		//es la mas rapida de todas
		//no permite elementos duplicados
		//np guarda los elementod en un orden aparente
		//no maneja indice
		Set<String> miSet = new HashSet<String>();
		
		miSet.add("Panchi");
		miSet.add("Paco");
		miSet.add("Panchito");
		miSet.add("Panchito");
		miSet.add("Martin");
		
		System.out.println(miSet);
	
		System.out.println(miSet.contains("Martin"));
		miSet.remove("Martin");
		imprimir(miSet);
		
		System.out.println("---HashMap---");
		//pares de valores (llave-valor)
		Map<String, Integer> miMap = new HashMap<String, Integer>();
		miMap.put("valor 1", 56);
		miMap.put("valor 2", 5);
		miMap.put("valor 3", 70);
		
		
		System.out.println(miMap);
		System.out.println(miMap.get("valor 2"));
		System.out.println(miMap.keySet());
		
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}


		
	}
	
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion ) {
			System.out.println("Elemento = " + elemento);
		}
	}

	
}
