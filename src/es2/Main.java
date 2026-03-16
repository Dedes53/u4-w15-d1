package es2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // che figata con i double non genera errore ma da direttamente infinito
        try {
            System.out.println("Bentornato dalla tua gita fuori porta!! \n" +
                    "Vuoi calcolare i consumi della tua auto?\n" +
                    "Dimmi, quanti km hai percorso?");
            int km = scanner.nextInt();
            System.out.println("Ora dimmi quanti litri hai consumato?");
            int l = scanner.nextInt();
            int kmxl = km / l;
            System.out.println("Wow!! Hai percorso: " + kmxl + " km con un litro di carburante");
        } catch (ArithmeticException e) {
            System.out.println("Eddai, non puoi non aver consumato benzina, sciocchino/a");
        } catch (InputMismatchException e) {
            System.out.println("Ehi guarda che si misura in numeri, gli antichi romani usavano le lettere, ma ormai non sono più di moda");
        } finally {
            System.out.println("Comunque sia, con quel che costa il carburante adesso spero che almeno tu ti sia divertito in giro");
        }


    }
}
