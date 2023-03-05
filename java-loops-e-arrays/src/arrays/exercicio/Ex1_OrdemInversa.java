package arrays.exercicio;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        


        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //para ordenar o array inverso usamos -> 
        int count = 0;

        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        while (count < vetor.length) {
            
            System.out.print(" " + vetor[count] + " X ");
            count++;
        }

        for (int c = (vetor.length - 1); c >= 0; c--) {
            System.out.print(" " + vetor[c] + " X ");
        }
    }
}
