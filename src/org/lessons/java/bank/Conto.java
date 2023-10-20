package org.lessons.java.bank;

public class Conto {
    private int accountCode;
    private double balance;
    private String ownerName;



// COSTRUTTORI

    //- alla creazione di un nuovo conto il saldo sia 0€

    public Conto(int accountCode, String ownerName) {
        balance = 0;
        this.accountCode = accountCode;
        this.ownerName = ownerName;
    }

    // METODI
    // PER CREARE UN METODO BISOGNA FARE 3 COSE:
    // - dargli un nome
    // - definire che tipo di dato restituisce
    // - definire se ha bisogno di parametri dall'esterno
    public void addBalance(double amount){
        if(amount >= 0 && (balance + amount) >= 0) {
            balance += amount;
        }
    }
    public void removeBalance(double amount){
        if(amount > 0 && (balance - amount) >= 0) {
            balance -= amount;
        }
    }


    //Il codice conto sia accessibile solo in lettura,
    //il saldo sia accessibile solo in lettura
    public int getAccountCode() {
        return accountCode;
    }

    public String getBalance() {
        double formatBal = (int) (balance * 100) / 100.0;
        String output  = formatBal + "€";
        return output;
    }

    //il proprietario sia accessibile in lettura e in scrittura
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


}
