package com.example;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Coin Calculator Demo
        Scanner input = new Scanner(System.in);
        CoinService coinService = new CoinService(input);

        System.out.println("-----------------------------\n| Starting Coin Calculator! |\n-----------------------------");
        
        boolean shouldEndProcess = false;
        
        while (!shouldEndProcess) {
            System.out.print("Start calculator? (Y/N): ");
            String answer = input.nextLine();
            answer = answer.trim().toLowerCase();

            if (answer.equals("y")) {
                coinService.start();
            } else if (answer.equals("n")) {
                shouldEndProcess = true;
            } else {
                System.out.println("Please provide a valid answer! (Y/N)");
                continue;
            }
        }

        System.out.print("---------------------------\n| Ending Coin Calculator! |\n---------------------------");

        input.close();
    }
}
