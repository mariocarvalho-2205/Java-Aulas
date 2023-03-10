package arrays.exercicio;

import java.util.Random;

public class Ex3_NumerosAleatorios {
	public static void main(String[] args) {
	
		Random random = new Random();

		int[] numerosAleatorios = new int[20];

		for (int i = 0; i < numerosAleatorios.length; i++) {
			int num = random.nextInt(100);
			numerosAleatorios[i] = num;
		};

		for (int i : numerosAleatorios) {
			System.out.println("Sucessor de " + i + " é " + (i + 1));
		}
	}    
}
