package guesingNumbers;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Welcome to the game Guess number");
        System.out.println("Write your number: ");
        Scanner scanner = new Scanner(System.in);

        int guessNum = (int)(Math.random() * 11);
        int num =0;
        System.out.println(guessNum);

        while (num!= guessNum){
            num = scanner.nextInt();

            if(num < guessNum) {
                System.out.println("number is low");
            } else if (num > guessNum) {
                System.out.println("number is high");
            } else if (guessNum ==num) {
                System.out.println("you won!");
            }
        }

    }
}