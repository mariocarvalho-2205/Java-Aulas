public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); // cria o objeto smartTv

        

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        
        if(smartTv.ligada == false) {
            smartTv.ligar();  // chama o metodo do objeto
            System.out.println("Novo Status da TV? " + smartTv.ligada);
        }

        if(smartTv.ligada == true) {
            smartTv.desligar();
            System.out.println("Ultimo Status da TV? " + smartTv.ligada);
        }
         
        if(smartTv.volume == 25) {
            smartTv.diminuirVolume();
            System.out.println("Volume Atual: " + smartTv.volume);
        }

        if(smartTv.volume == 24) {
            smartTv.aumentarVolume();
            System.out.println("Volume Atual: " + smartTv.volume);
        }

        smartTv.mudarCanal(15);  // passa o parametro para o metodo
        System.out.println("Canal Atual: " + smartTv.canal);



    }
}
