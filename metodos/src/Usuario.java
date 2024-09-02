public class Usuario {

    public static void main (String[] args) throws Exception {
    
            SmartTV smartTV = new SmartTV();
    
            System.out.println("TV Ligada? " + smartTV.ligada);
            System.out.println("Qual o canal atual? " + smartTV.canal);
            System.out.println("Qual o volume atual? " + smartTV.volume);
    
            smartTV.ligar();
                System.out.println("TV ligada! " + smartTV.ligada);
           smartTV.aumentarVolume();
           smartTV.diminuirVolume();
           smartTV.mudarCanal(17);
    
    }
    
    }