package com.bridgelabz;

import java.util.Scanner;

public class Main {

    final int bet = 1;

    public static void main(String[] args) {
        // Welcome to the game of Gambling.
      String restart = null;

        do{   int days = 0, win = 0, lose = 0;
        int win_count = 0, loose_count = 0;
        while (days < 30) {
            int stake = 100;
            int result, turn = 0;
            int win_per_day = 0, loss_per_day = 0;
            while (stake > 0) {

                result = (int) Math.floor((Math.random() * 10) % 2);
                //System.out.println(result);
                if (result == 0) {
                    //     System.out.println("Win");
                    stake = stake + 1;
                    win++;
                    win_per_day++;

                } else {
                    //  System.out.println("Lose");
                    stake = stake - 1;
                    lose--;
                    loss_per_day--;

                }
                if (stake == 150 || stake == 50) {
                    //System.out.println("Amount left " +stake);
                    break;

                }
                turn++;
                //System.out.println("Turn No" + turn);
                //System.out.println("Amount left " +stake);
            }
            days++;

            if (days == 20) {
                int outcome_for_20_days = win + lose;
                System.out.println("Total Profits or loss after 20 days= " + outcome_for_20_days);
            }


            if (win_per_day + loss_per_day >= 0) {
                win_count++;
                System.out.println("Total Profit for the day " + days + " = " + (win_per_day + loss_per_day));
            } else
                loose_count++;
            System.out.println("Total loss for the day " + days + " = " + (win_per_day + loss_per_day));

        }
        int outcome = win + lose;
        System.out.println("Total Profits or loss after 30 days= " + outcome);
        System.out.println("Total days won = " + win_count);
        System.out.println("Total days lost = " + loose_count);

            System.out.println("\n Do you want to Continue for next month. ");
            Scanner sc = new Scanner(System.in);
            restart = sc.next();

    }while(restart == "Y");
    }
}