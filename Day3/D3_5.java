import java.util.Random;
import java.util.Scanner;
public class D3_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            System.out.print("Guess a number between 1 and 10: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        }
                scanner.close();
    }
}



            
        

    

