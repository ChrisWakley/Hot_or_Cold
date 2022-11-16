package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int guess = 0;
        int count = 0;

        System.out.println("Guess the number between "+min+" and "+max+ ":");
        int answer = (int)Math.floor(Math.random()*(max-min+1)+min);
//        System.out.println("Random integer = " + answer);

        Scanner sc = new Scanner(System.in);

        while (answer != guess) {
            if(count == 10) {
                sc.close();
                System.out.println("You failed to guess the number correctly, no tries remaining. The answer was " + answer + " Better luck next time!");
            }
            guess = sc.nextInt();
            if (guess == answer) {
                System.out.println("You guessed correctly, well done!");
            } else if (guess >= answer - 3 && guess <= answer + 3) {
                count++;
                System.out.println("Very, very warm.");
                System.out.println("You have used " + count + " guesses out of 10.");
            } else if (guess >= answer - 6 && guess <= answer + 6) {
                count++;
                System.out.println("Very warm.");
                System.out.println("You have used " + count + " guesses out of 10.");
            } else if (guess >= answer - 10 && guess <= answer + 10) {
                count++;
                System.out.println("Warm.");
                System.out.println("You have used " + count + " guesses out of 10.");
            } else if (guess >= answer - 16 && guess <= answer + 16) {
                count++;
                System.out.println("Cold.");
                System.out.println("You have used " + count + " guesses out of 10.");
            } else if (guess >= answer - 21 && guess <= answer + 21) {
                count++;
                System.out.println("Very cold.");
                System.out.println("You have used " + count + " guesses out of 10.");
            } else if (guess >= answer - 25 && guess <= answer + 25) {
                count++;
                System.out.println("Freezing.");
                System.out.println("You have used " + count + " guesses out of 10.");
            } else if (guess >= answer - 30 && guess <= answer + 30) {
                count++;
                System.out.println("Artic!");
                System.out.println("You have used " + count + " guesses out of 10.");
            } else {
                count++;
                System.out.println("No where near...");
                System.out.println("You have used " + count + " guesses out of 10.");
            }
        }
    }
}
