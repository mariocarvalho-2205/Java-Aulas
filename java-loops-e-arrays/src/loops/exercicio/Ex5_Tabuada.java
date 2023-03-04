package loops.exercicio;

import java.util.Scanner;

public class Ex5_Tabuada {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);



        System.out.println("Qual numero sera a tabuada? ");
        int numero = scan.nextInt();

        System.out.println("Imprimindo a tabuada de " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }

    }
}
