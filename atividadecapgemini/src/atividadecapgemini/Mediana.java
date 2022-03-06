package atividadecapgemini;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mediana {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(9, 2, 1, 4, 6);
		
		Collections.sort(numeros);
		
		for (int c : numeros) {
			System.out.println(c);
		}
		
		System.out.println();
		int mediana = (int) Math.floor(numeros.size()/2);
		System.out.println(numeros.get(mediana));
	}

}
