package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product{
    private int imei;
    private int memory;
    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int imei, int memory) {
        super(name, description, price, vat);
        this.imei = imei;
        this.memory = memory;
    }
}
