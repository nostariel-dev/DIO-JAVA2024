//While

import java.util.concurrent.ThreadLocalRandom;

public class Mesada {
    public static void main(String[] args) {
        double mesada = 50.0;
            while (mesada > 0) {
                Double valorDoce = valorAleatorio();
                    if (valorDoce > mesada) 
                        valorDoce = mesada;

                System.out.println("Doce do valor " + valorDoce + "adicionado ao carrinho.");
                        mesada = mesada - valorDoce;
                    
                System.out.println("Mesada: " + mesada);
                System.out.println("João gastou toda a sua mesada em doces.");
            }
        
    }