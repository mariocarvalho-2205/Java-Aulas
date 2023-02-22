package edu.aula.anatomia;



public class MinhaClasse {
    public static void main (String [] args) {

        // Variaveis

        String primeiroNome = "Mario";
        String segundoNome = "Carvalho";

        String nomeCompleto = NomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        // Anatomia das classes
        /* 
         * para criar uma variavél que não poderá ser
         * modificada, usamos todas as letrar maiusculas
         * iniciando a linha com a palavra final
         ? Ex: final String BR = "Brasil"

         ! Estrutura para declaração de variaveis
        
        estrutura:

        Tipo nomeVariavel = Atribuição (opcional em alguns casos)

        Ex: 

        int idade = 23;
        double altura = 1.60;
        Dog spike; A variavel fi declarada mais ainda nao tem valor definido
        */

        String meuNome = "Mario";

        int idade = 47;

        double altura = 1.60;

        boolean idadeVerdadeira = true;

        System.out.print(meuNome + " " + idade + " " + altura + " " + idadeVerdadeira);

    }
    /*
     * ! Estrutura dos Metodos
     * 
     * O metodo pode receber parametros de tipos diferentes
     * 
     * Ex:
     * TipoRetorno NomeObjetivoNoInfinitivo Parametor(s)
     * 
     * Sintaxe:
     * public static String NomeCompleto (String primeiroNome, String segundoNome) {
     * 
     * }
     * 
     */

    public static String NomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    /* 
     * Organização de packages(pacostes)
     */
}
