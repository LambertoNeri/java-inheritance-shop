package org.lessons.java.shop;

import java.math.BigDecimal;

public class TV extends Product {
    private BigDecimal size;
    private Boolean smart;
    public TV(String name, String description, BigDecimal price, BigDecimal vat, BigDecimal size, Boolean smart) {
        super(name, description, price, vat);
        this.size = size;
        this.smart = smart;
    }
}
