import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        int[] numerinteri;
        numerinteri = new int[5];
        for (int i = 0; i < numerinteri.length; i++) {
            numerinteri[i] = random.nextInt(11);
        }
        ;
        System.out.println(Arrays.toString(numerinteri));
        while (true) {
            try {
                System.out.println("Inserisci un numero (0 per uscire): ");
                int numero = scanner.nextInt();

                if (numero == 0) {
                    System.out.println("Uscita dal programma.");
                    scanner.close();
                    break;
                }

                System.out.println("Inserisci la posizione (0-4): ");
                int posizione = scanner.nextInt();

                if (posizione < 0 || posizione >= numerinteri.length) {
                    System.out.println("Errore: posizione non valida. Deve essere tra 0 e 4.");
                } else {
                    numerinteri[posizione] = numero;
                    System.out.println(Arrays.toString(numerinteri));
                }
            } catch (InputMismatchException e) {
                System.out.println("carattere non consentito");
                scanner.nextLine();
            }
        }

    }
}