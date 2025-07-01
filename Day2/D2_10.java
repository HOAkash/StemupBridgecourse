import java.util.Scanner;
public class D2_10 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.close();

        switch (choice) {
            case 1:
                System.out.println("You have chosen to check your balance.");
                break;
            case 2:
                System.out.println("You have chosen to withdraw money.");
                break;
            case 3:
                System.out.println("You have chosen to deposit money.");
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

    

