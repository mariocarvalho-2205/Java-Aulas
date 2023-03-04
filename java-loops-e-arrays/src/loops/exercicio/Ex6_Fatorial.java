package loops.exercicio;

import java.net.SocketPermission;
import java.util.Scanner;

public class Ex6_Fatorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();    
        int f = 1;

        System.out.print(fatorial + "! = ");
        for (int c = fatorial; c >= 1; c--) {
            f = f * c;
        }
        System.out.println(f);
    }
    
}
