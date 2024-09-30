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
                System.out.println("!!!");
                scanner.nextLine();
            }
        }

        Scanner scanner1 = new Scanner(System.in);
        try {
            System.out.println("Inserisci i km percorsi");
            int km = scanner1.nextInt();
            System.out.println("Inserisci i litri di carburante consumati");
            int litri = scanner1.nextInt();

            int Consumo = km / litri;
            if (litri == 0) {
                throw new ArithmeticException("non si può dividere per 0");
            }
            System.out.println("KM percorsi per litro:"+Consumo);
            scanner1.close();
        }catch (ArithmeticException e ){
            System.out.println("inserisci un valore valido");
            e.printStackTrace();
        }
    }
}