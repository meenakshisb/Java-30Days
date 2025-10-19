import java.util.Random;
import java.util.Scanner;

public class RockPapperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        System.out.println("Welcome to Rock-Paper-Scissors Game!");
        System.out.println("--------------------------------------");

        while (playAgain) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = sc.next().toLowerCase();

            // Validate input
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            // Computer's random choice
            String computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            // Compare choices
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // Ask to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String answer = sc.next().toLowerCase();
            playAgain = answer.equals("yes");
        }

        System.out.println("\nThanks for playing!");
        sc.close();
    }
}
