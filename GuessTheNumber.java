import java.util.*;

public class GuessTheNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfGuesses = 0;
        int guess;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            numberOfGuesses++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != numberToGuess);

        System.out.println("Congratulations, you guessed the number in " + numberOfGuesses + " guesses!");
    }
}