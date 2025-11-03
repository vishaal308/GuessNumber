import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1; // 1–100
        int guess = 0;
        int tries = 0;

        System.out.println("🎯 Guess the Number (1 to 100)");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            tries++;

            if (guess > number)
                System.out.println("Too high! Try again.");
            else if (guess < number)
                System.out.println("Too low! Try again.");
            else
                System.out.println("🎉 Correct! You guessed in " + tries + " tries.");
        }

        sc.close();
    }
}