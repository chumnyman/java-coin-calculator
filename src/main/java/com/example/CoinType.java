package com.example;

public enum CoinType {
    PENNY("Penny", 0.01),
    NICKEL("Nickel", 0.05),
    DIME("Dime", 0.10),
    QUARTER("Quarter", 0.25);

    private final String name;
    private final double value;

    CoinType(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
