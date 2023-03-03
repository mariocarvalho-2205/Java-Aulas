package loops.exercicio;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;
        int cont = 0;
        int maior = 0;
        int total = 0;
        int media = 0;

        do {
            
            System.out.println("Digite um numero: ");
            num = scan.nextInt();

            if (num > maior) maior = num;            

            total += num;
            cont++;

        } while (cont < 5);

        media = total / cont;

        //System.out.println(total + " " + cont + " " + media);
        System.out.println("O maior numero é -> " + maior);
        System.out.println("A media dos numeros é -> " + media);
    }    
}
