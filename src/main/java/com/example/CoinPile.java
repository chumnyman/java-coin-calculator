package com.example;

public class CoinPile {
    private final CoinType coinType;
    private int quantity;

    public CoinPile(CoinType coinType) {
        this.coinType = coinType;
        this.quantity = 0;
    }

    public CoinPile(CoinType coinType, int quantity) {
        this.coinType = coinType;
        this.quantity = quantity;
    }

    public double calculateAmount() {
        return coinType.getValue() * quantity;
    }

    public double getValue() {
        return coinType.getValue();
    }

    public int getQuantity() {
        return quantity;
    }

    public CoinPile addQuantity(int quantity) {
        this.quantity += quantity;
        return this;
    }

    public String getCoinType() {
        return coinType.getName();
    }

}
