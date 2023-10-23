package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class ShoppingKart {
    public static void main(String[] args) {




        //importo la classe scanner
        Scanner scan = new Scanner(System.in);


        //richiedo di inserire 3 prodotti
        System.out.println("quanti prodotti vuoi acquistare?");
        int sales = scan.nextInt();
        scan.nextLine();

        Product[] shoppingKart = new Product[sales];

        //creo un ciclo per creare gli X prodotti
        for (int i = 0; i < sales; i++) {
            System.out.println("Definisci il prodotto che stai inserendo con un numero:");
            System.out.println("1) Smartphone");
            System.out.println("2) Televisore");
            System.out.println("3) Cuffie");
            int productType = scan.nextInt();
            scan.nextLine();

            if (productType == 1 || productType == 2 || productType == 3) {
                System.out.println("inserisci il nome del " + (i + 1) + "° prodotto");
                String name = scan.nextLine();
                System.out.println("inserisci la descrizione del " + (i + 1) + "° prodotto");
                String description = scan.nextLine();
                System.out.println("inserisci il prezzo del " + (i + 1) + "° prodotto");
                String price = scan.nextLine();
                System.out.println("inserisci l'iva del " + (i + 1) + "° prodotto");
                String vat = scan.nextLine();
                if (productType == 1) {
                    //richiedo Type variables
                    System.out.println("inserisci il codice IMEI dello Smartphone");
                    int imei = scan.nextInt();
                    System.out.println("inserisci grandezza memoria dello Smartphone");
                    int memory = scan.nextInt();

                    Smartphone[] smartphone = new Smartphone[i];
                    //invoco il costruttore Smartphone
                    shoppingKart[i] = new Smartphone(name, description, new BigDecimal(price), new BigDecimal(vat), imei, memory);
                } else if (productType == 2) {
                    //creo variabile smart
                    Boolean smart;
                    //richiedo Type variables
                    System.out.println("Definisci dimensione es.(60x53)");
                    String size = scan.nextLine();
                    System.out.println("La TV è smart? ");
                    System.out.println("1) Si");
                    System.out.println("2) No");
                    int sino = scan.nextInt();
                    scan.nextLine();
                    if(sino == 1) {
                        smart = true;
                    } else if (sino == 2) {
                        smart = false;
                    } else{
                        System.out.println("Scelta non valida");
                        System.out.println("Terminazione programma...");
                        break;
                    }
                    //invoco il costruttore TV
                    TV[] tv = new TV[i];
                    shoppingKart[i] = new TV(name, description, new BigDecimal(price), new BigDecimal(vat), size, smart);

                } else if (productType == 3) {
                    Boolean wired;
                    //richiedo Type variables
                    System.out.println("Colore cuffie");
                    String color = scan.nextLine();
                    System.out.println("Le cuffie hanno il filo?");
                    System.out.println("1) Si");
                    System.out.println("2) No");
                    int sino= scan.nextInt();
                    scan.nextLine();
                    if(sino == 1) {
                        wired = true;
                    } else if (sino == 2){
                        wired = false;
                    } else {
                        System.out.println("Scelta non valida");
                        System.out.println("Terminazione programma...");
                        break;
                    }


                    //invoco il costruttore Headphone
                    Headphones[] headphones = new Headphones[i];
                    shoppingKart[i] = new Headphones(name, description, new BigDecimal(price), new BigDecimal(vat), color, wired);
                }

            }else{
                    System.out.println("Il numero prodotto inserito non è valido");
                    break;
            }
        }

        System.out.println("Il tuo carrello contiene " + shoppingKart.length + " oggetti, di seguito troverai i dettagli: ");
        BigDecimal totalPrice = new BigDecimal(0);
        for (int i = 0; i < shoppingKart.length; i++) {

            totalPrice = totalPrice.add(shoppingKart[i].getFinalPrice());
            System.out.println("Nome completo: " + shoppingKart[i].getFullName());
            System.out.println("Prezzo compreso di iva: " + shoppingKart[i].getFinalPrice() + "€");
        }
        System.out.println("Prezzo totale carrello: " + totalPrice + "€");
        System.out.println("Procedere con l'aqcuisto?");
        System.out.println("1) Si");
        System.out.println("2) No");
        int sino = scan.nextInt();
        scan.nextLine();
        if(sino == 1 ){
            System.out.println("Acquisto completato, totale pagato: " +totalPrice+ "€");
        } else if (sino == 2){
            System.out.println("Transazione annullata...");
        }else {
            System.out.println("Scelta non valida");
            System.out.println("Terminazione programma...");
        }

        scan.close();
    }

}