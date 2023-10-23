package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
// PRIMA COSA DA FARE DEFINIRE GLI ATTRIBUTI

    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    private Random rand = new Random();

    // COSTRUTTORI

    //alla creazione di un nuovo prodotto venga passato il valore di tutti gli attributi, tranne il codice, che deve essere valorizzato con un numero random
    public Product(String name, String description, BigDecimal price, BigDecimal vat) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
        id = rand.nextInt(3000, 100000000);
    }


    // METODI
    // PER CREARE UN METODO BISOGNA FARE 3 COSE:
    // - dargli un nome
    // - definire che tipo di dato restituisce
    // - definire se ha bisogno di parametri dall'esterno

    //Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
    public BigDecimal getFinalPrice() {
        return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);
    }

    public String getFullName() {
        return id + "-" + name;
    }

    private String getPaddedCode(){
        String codeString = Integer.toString(id);

        while(codeString.length() < 8 ){
            codeString = "0" + codeString;
        }
        return codeString;
    }

    //Il codice prodotto sia accessibile solo in lettura
    public int getId() {
        return id;
    }

    //Gli altri attributi siano accessibili sia in lettura che in scrittura

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
