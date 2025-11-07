package com.example;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private List<CoinPile> coinPiles = new ArrayList<>();

    public Wallet() {
    }

    public Wallet addCoins(CoinPile coins) {
        coinPiles.add(coins);
        return this;
    }

    public double getTotalValue() {
        double total = 0;

        for (CoinPile coins : coinPiles) {
            total += coins.calculateAmount();
        }

        return total;
    }

    public int getCoinCount() {
        return coinPiles.size();
    }
}
