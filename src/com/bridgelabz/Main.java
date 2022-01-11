package com.bridgelabz;

public class Main {

    final int stake = 100;
    final int bet = 1;

    public static void main(String[] args) {
        // Welcome to the game of Gambling.
        int result;
        result = (int)Math.floor((Math.random() * 10) % 2);
        //System.out.println(a);
        if (result == 0) {
            System.out.println("Win");
        }    else {
            System.out.println("Lose");
        }


    }
}
