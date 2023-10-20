package org.lessons.java.shop;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Prodotto[] prodotti = new Prodotto[3];
    public static void main(String[] args) {
        //importo la classe scanner
        Scanner scan = new Scanner(System.in);

        //richiedo di inserire 3 prodotti
        System.out.println("inserisci 3 prodotti in sequenza");

        //creo un ciclo per creare i 3 prodotti
        for(int i = 0; i < 3; i++ ) {
            System.out.println("inserisci il nome del " + (i+1) +"° prodotto");
            String nome = scan.nextLine();
            System.out.println("inserisci la descrizione del " + (i+1) +"° prodotto");
            String descrizione = scan.nextLine();
            System.out.println("inserisci il prezzo del " + (i+1) +"° prodotto");
            int prezzo = scan.nextInt();
            System.out.println("inserisci l'iva del " + (i+1) +"° prodotto");
            int iva = scan.nextInt();
            String dump = scan.nextLine();

            //invoco il costruttore
            prodotti[i] = new Prodotto(nome, descrizione, prezzo, iva);
        }

        for (int i = 0; i < prodotti.length; i++){
            System.out.println("Nome completo: "+prodotti[i].getNomeEsteso());
            System.out.println("Prezzo compreso di iva: "+prodotti[i].getPrezzoIva());
        }

    }
}
