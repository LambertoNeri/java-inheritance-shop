package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
// PRIMA COSA DA FARE DEFINIRE GLI ATTRIBUTI

    private int codice;
    private String nome;
    private String descrizione;
    private int prezzo;
    private int iva;

    Random rand = new Random();

    // COSTRUTTORI

    //alla creazione di un nuovo prodotto venga passato il valore di tutti gli attributi, tranne il codice, che deve essere valorizzato con un numero random
    public Prodotto(String nome, String descrizione, int prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        codice = rand.nextInt(3000, 5000);
    }


    // METODI
    // PER CREARE UN METODO BISOGNA FARE 3 COSE:
    // - dargli un nome
    // - definire che tipo di dato restituisce
    // - definire se ha bisogno di parametri dall'esterno

    //Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
    public int getPrezzoIva() {
        return prezzo + (prezzo * iva / 100);
    }

    public String getNomeEsteso() {
        return codice + "-" + nome;
    }

    //Il codice prodotto sia accessibile solo in lettura
    public int getCodice() {
        return codice;
    }

    //Gli altri attributi siano accessibili sia in lettura che in scrittura

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
}
