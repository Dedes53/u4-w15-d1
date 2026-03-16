package es1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
            int rndm = (int) (Math.random() * 10) + 1;
            populateArray(intArray, i, rndm);
        }

        try {
            System.out.println("Questo è il tuo array al momento: " + Arrays.toString(intArray));
            System.out.println("Se vuoi modificarlo scrivi il nuovo elemento da aggiungere:");
            int e = scanner.nextInt();
            System.out.println("In quale posizione desideri aggiungerlo?");
            int pos = scanner.nextInt() - 1;
            populateArray(intArray, pos, e);
            System.out.println(Arrays.toString(intArray));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Non puoi inserire un elemento fuori dall' array");
        } catch (InputMismatchException e) {
            System.out.println("Stai attento, non hai inserito un numero");
        } catch (Exception e) {
            System.out.println("Ops, sembra si sia verificato un errore");
        } finally {
            System.out.println("Modifica conclusa");
        }
    }


    static void populateArray(int[] arr, int index, int value) {
        arr[index] = value;
    }
}
