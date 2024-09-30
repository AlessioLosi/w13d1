import Classi.BancaException;
import Classi.ContoCorrente;
import Classi.ContoOnline;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ContoCorrente newConto = new ContoCorrente("Taylor Allison", 2605);
        System.out.println(newConto.restituisciSaldo());

        try {
            newConto.preleva(1500);
            System.out.println(newConto.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("impossibile prelevare");
            e.printStackTrace();
        }

    ContoOnline contoOn=new ContoOnline("Tatiana McRae",30000,2000);
        contoOn.stampaSaldo();
        try{
            contoOn.preleva(1700);
            contoOn.stampaSaldo();
        }catch(BancaException e){
            System.out.println("Impossibile procedere con il prelievo");
            e.printStackTrace();
        }
}}