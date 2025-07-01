import java.util.Scanner;
public class D2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.close();

        double price;
        if (age < 5 || age > 65) {
            price = 5.0;
        } else if (age >= 5 && age <= 18 && isStudent) {
            price = 8.0;
        } else {
            price = 12.0;
        }

        System.out.println("The movie ticket price is: $" + price);
    }
}

    

