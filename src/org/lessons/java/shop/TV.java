package org.lessons.java.shop;

import java.math.BigDecimal;

public class TV extends Product {
    private String size;
    private Boolean smart;
    public TV(String name, String description, BigDecimal price, BigDecimal vat, String size, Boolean smart) {
        super(name, description, price, vat);
        this.size = size;
        this.smart = smart;
    }

    @Override
    public String toString() {
        String sino;
        if(smart == true){
            sino = "Si";
        } else {
            sino = "No";
        }
        return this.getName() +
                ", Dimensioni: '" + size + '\'' +
                ", Smart: " + sino +
                '}';
    }
}
