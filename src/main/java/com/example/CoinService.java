package com.example;

import java.util.Scanner;

public class CoinService {
    private Scanner input;
    private boolean isStarted = false;

    public CoinService(Scanner input) {
        this.input = input;
    }

    public void start() {
        if (isStarted) return;
        isStarted = true;

        Wallet wallet = new Wallet();

        double total = wallet.addCoins(getInput(CoinType.PENNY))
            .addCoins(getInput(CoinType.NICKEL))
            .addCoins(getInput(CoinType.DIME))
            .addCoins(getInput(CoinType.QUARTER))
            .getTotalValue();

        System.out.println("Your total is: $" + total);

        isStarted = false;
    }

    public void end() {
        if (!isStarted) return;
        isStarted = false;
    }

    private CoinPile getInput(CoinType coinType) {
        int quantity = -1;
        do {
            System.out.print("Enter " + coinType.getName() + " Amount (int): ");
            String line = input.nextLine().trim();
            
            if (line.matches("-?\\d+")) {
                quantity = Integer.parseInt(line);
            } else {
                System.out.println("Please pick an integer!");
                continue;
            }
        } while (isStarted && quantity == -1);

        return new CoinPile(coinType, quantity);
    }
}
