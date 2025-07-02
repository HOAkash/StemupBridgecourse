 import java.util.Scanner;
public class D3_4 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        scanner.close();
        System.out.println("Total: " + sum);
    }
}


