import java.util.Scanner;

public class D1_7 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        double marks = scanner.nextDouble();
        scanner.close();

        if (marks >= 0 && marks <= 100) {
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 80) {
                System.out.println("Grade: B");
            } else if (marks >= 70) {
                System.out.println("Grade: C");
            } else if (marks >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        } else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
    }
}


    

