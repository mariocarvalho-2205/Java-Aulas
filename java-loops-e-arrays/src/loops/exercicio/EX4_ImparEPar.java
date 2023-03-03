package loops.exercicio;

import java.util.Scanner;

public class EX4_ImparEPar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int num;
        int count = 0, pares = 0, totalPares = 0, totalImpares = 0;

        int impar = 0;

        System.out.println("Quantos numeros quer calcular? ");
        qtdNumeros = scan.nextInt();

        do {
            System.out.println("Digite um numero: ");
            num = scan.nextInt();

            if (num % 2 == 0) {
                pares++;
                totalPares += num;

            } else {
                impar++;
                totalImpares += num;

            }

            
            count++;
        } while (count < qtdNumeros);

        System.out.println("Foram digitados " + pares + "pares");
        System.out.println("Totalizando " + totalPares);
        System.out.println("Foram digitados " + impar + "impares");
        System.out.println("Totalizando " + totalImpares);
    }    
}
