package edu.aula.tiposVariaveis;

public class TiposVariaveis {

    public static void main(String[] args) {
        System.out.print("teste");

        /*
        * Tipos primitivos
        
        ? Temos oito tipos primitivos

        byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes)
        float(4 bytes), double(8 bytes)
        
        Tipos de dados:
        
        String, int, double, boolean, array, objeto
        

        byte idade = 123;
        short ano = 2023;
        int cep = 21070333;
        long cpf = 12345678900L; // é preciso terminar com u a letra l no final
        float pi = 3.14F  // é preciso terminar com u a letra f no final
        double salarioMinimo = 2500.50;
        
        
        */
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
    }
}
