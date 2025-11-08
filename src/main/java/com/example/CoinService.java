package com.example;

import java.util.Scanner;

public class CoinService {
    private Scanner input;

    public CoinService(Scanner input) {
        this.input = input;
    }

    public void start() {
        Wallet wallet = new Wallet();

        double total = wallet.addCoins(getInput(CoinType.PENNY))
                .addCoins(getInput(CoinType.NICKEL))
                .addCoins(getInput(CoinType.DIME))
                .addCoins(getInput(CoinType.QUARTER))
                .getTotalValue();

        System.out.println(String.format("Your total is: $%.2f", total));
    }

    private CoinPile getInput(CoinType coinType) {
        int quantity = -1;

        do {
            System.out.print("Enter " + coinType.getName() + " Amount (int): ");
            String line = input.nextLine().trim();

            if (line.matches("-?\\d+")) {
                int newQuantity = Integer.parseInt(line);

                if (newQuantity < 0) {
                    System.out.println("Please pick a positive integer!");
                    continue;
                }

                quantity = newQuantity;
            } else {
                System.out.println("Please pick an integer!");
                continue;
            }
        } while (quantity == -1);

        return new CoinPile(coinType, quantity);
    }

}
