public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // criação dos metodos dentro da classe
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Abaixando o volume " + volume);
    }

    // metodo com parametro
    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

}
