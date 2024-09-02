public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;
    
    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }
    
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume (){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void avancarCanal(){
        canal++;
        System.out.println("Alterando canal para: " + canal);
    }

    public void retrocederCanal(){
        canal--;
        System.out.println("Alterando canal para: " + canal);
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("Alterando canal para: " + canal);
 
   }
   
}
