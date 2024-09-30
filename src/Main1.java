import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

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
            int litri=scanner1.nextInt();
            e.printStackTrace();
        }
    }
}