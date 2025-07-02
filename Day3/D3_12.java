 import java.util.Scanner;
public class D3_12 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Skipping negative number: " + num);
                continue;
            }

            sum += num;
        }

        scanner.close();
        System.out.println("Sum of positive numbers: " + sum);
    }
}


    

