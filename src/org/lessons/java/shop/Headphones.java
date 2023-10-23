package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphones extends Product{

    private String color;
    private Boolean wired;

    public Headphones(String name, String description, BigDecimal price, BigDecimal vat, String color, Boolean wired) {
        super(name, description, price, vat);

        this.color = color;
        this.wired = wired;
    }

    @Override
    public String toString() {
        String sino;
        if(wired == true){
            sino = "Si";
        } else {
            sino = "No";
        }
        return this.getName() +
                ", Colore Cuffie: " + color +
                ", Wireless: " + sino +
                '}';
    }
}
