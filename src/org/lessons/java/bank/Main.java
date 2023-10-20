package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Chiamo e importo Scanner
        Scanner scan = new Scanner(System.in);
        //Chiamo e importo Random

        Random rand = new Random();


        //chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero di conto random (da 1 a 1000)

        System.out.println("Perfavore inserisci il tuo nome per generare un account");
        String ownerName = scan.nextLine();
        int accountCode = rand.nextInt(1, 1000);
        Conto conto = new Conto(accountCode, ownerName);



        boolean exit = false;

        while (exit == false ) {
            System.out.println("Buongiorno " + conto.getOwnerName() + " il saldo attuale del tuo conto ammonta a " + conto.getBalance());
            System.out.println("Perfavore scegli una delle seguenti opzioni:");
            System.out.println("- Digita 1 per depositare denaro sul conto");
            System.out.println("- Digita 2 per prelevare denaro dal conto");
            System.out.println("- Digita 3 per uscire");
            int input = scan.nextInt();

            if (input == 1) {
                System.out.println("quanto denaro vuoi depositare?");
                int amount = scan.nextInt();
                conto.addBalance(amount);
            } else if (input == 2) {
                System.out.println("quanto denaro vuoi prelevare?");
                int amount = scan.nextInt();
                conto.removeBalance(amount);

            } else if (input == 3) {
                System.out.println("Grazie per aver usufruito dei servizi di BancaLamberto la banca piu sicura di Bracciano");
                exit = true;
            } else {
                System.out.println("Scelta non valida");
                System.out.println("Uscita dal conto in corso..");
                exit = true;
            }
        }

    }
}
