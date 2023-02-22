package edu.mario.estudo;

public class Operadores {
    
    public static void main(String[] args) {
        //System.out.print("mario");
        /*
        ? Operadores

        * Aspas simples, só poderão ser usados com uma unica string ex: 'm'
        * Atribuição = 
        * operadores Aritmeticos

        * Soma + 
        * Subtração -
        * Multiplicação *
        * Divisão /
        * Modulo %
        * operador de valor positivo (+)
        * operador de valor negativo (-) nega um numero
        * Incremento (++)
        * Decremento (--)
        * Negação Logica (!)
        ? Relacionais
        * == igual a
        ! OBS: Para fazer a comparação entre objetos, usamos o metodo equals()
            ? sintaxe -> variavel_A.equals(variavel_B)
        * != diferente a
        * > maior que
        * < menor que
        * >= maior ou igual a
        * <= menor ou igual a

        ? Operadores logicos
        * && operador e
        * || operador ou
        ! Para tornar um valor positivo, multiplica ele mesmo por -1
        */

        String concatenado = "?";

        concatenado = 1 + "1" + 1 + 1;

        System.out.println(concatenado);

        
        concatenado = 1 + "1" + 1 + "1";

        System.out.println(concatenado);

        
        concatenado = "1" + 1 + 1 + 1;

        System.out.println(concatenado);

        
        concatenado = "1" + (1 + 1 + 1);

        System.out.println(concatenado);

        // incremento

        int num2 = 1;

        num2++;
        num2++;
        
        System.out.println(num2);
        num2--;
        System.out.println(num2);

        /*
        ! Operador ternario 
        * Sintaxe
        * (a == b) ? a + b : falze;
        *
        * Condicional tradicional
        *
        * if (a == b)
        *   resultado = "verdadeiro";
        * else 
        *   resultado = "falso";
        */
        
        int a, b;
        a = 5;
        b = 6;
        String resultado;
        resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

    }
}
