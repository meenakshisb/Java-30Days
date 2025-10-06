import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomNumber = random.nextInt(100);
		int guess = 0;
		int attempts = 0;
		
		System.out.println("Welcome to the Number Guessing Game!\n");
		System.out.println("I'm thinking of a number between 0 to 100.... ");
		System.out.println("Can you Guess it?");
		
		while(guess != randomNumber) {
			System.out.println("\nEnter your guess: ");
			
			if(scanner.hasNextInt()) {
				guess = scanner.nextInt();
				attempts++;
				
				if(guess < randomNumber) {
					System.out.println("Too low! Try again. ");
				} else if(guess > randomNumber) {
					System.out.println("Too high! Try again.");
				} else {
					System.out.println("\nCongratulations! You guessed it right.");
					System.out.println("It took you " + attempts + " attempts.");
				}
			} else {
				System.out.println("please enter a valid number!");
				scanner.next();
			}
		}
		
		scanner.close();

	}

}
