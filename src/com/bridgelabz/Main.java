package com.bridgelabz;

public class Main {

    final int bet = 1;

    public static void main(String[] args) {
        // Welcome to the game of Gambling.
        double stake = 100;
        int result;
        while (stake > 0) {
        result = (int)Math.floor((Math.random() * 10) % 2);
        //System.out.println(a);
        if (result == 0) {
            System.out.println("Win");
            stake = stake + 1;
        }    else {
            System.out.println("Lose");
            stake = stake -1;
        }
            stake = stake - (0.5 * stake);

    }
}
