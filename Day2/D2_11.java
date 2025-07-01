import java.util.Scanner;
public class D2_11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();
        scanner.close();

        if (score >= 90 && score <= 100) {
            System.out.println("Excellent");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Very Good");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Good");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Pass");
        } else if (score >= 0 && score < 60) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        }
    }
}

    

