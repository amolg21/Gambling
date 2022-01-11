package com.bridgelabz;

public class Main {

    final int bet = 1;

    public static void main(String[] args) {
        // Welcome to the game of Gambling.

        int days = 0, win = 0, lose = 0;
        while (days <= 20) {
            int stake = 100;
            int result, turn = 0;
            while (stake > 0) {
                result = (int) Math.floor((Math.random() * 10) % 2);
                System.out.println(result);
                if (result == 0) {
                    //     System.out.println("Win");
                    stake = stake + 1;
                    win++;
                } else {
                    System.out.println("Lose");
                    stake = stake - 1;
                    lose--;
                }
                if (stake == 150 || stake == 50) {
                    stake = 0;

                }
                turn++;
                System.out.println("Turn No" + turn);
                System.out.println("Amount left " +stake);
            }
            days++;
        }
        int outcome = win + lose;
        System.out.println("Total Profits or loss after 20 days " + outcome);

    }
}