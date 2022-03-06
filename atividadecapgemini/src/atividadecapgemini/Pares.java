package atividadecapgemini;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros quer digitar? ");
		int[] numeros =  new int[sc.nextInt()];
		
		for (int c = 0; c<numeros.length; c++) {
			System.out.print("Digite o valor #"+(c+1)+": ");
			numeros[c] = sc.nextInt();
		}
		
		System.out.print("Digite a diferença: ");
		int x = sc.nextInt();
		
		int dif;
		int pares = 0;
		for (int c : numeros) {
			for (int i : numeros) {
				dif = i - c;
				if (dif == x) {
					pares ++;
				}
			}
			
		}
		sc.close();
		
		System.out.println(pares);
	}
}
