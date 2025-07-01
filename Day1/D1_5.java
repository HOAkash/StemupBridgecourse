import java.util.Scanner;

public class D1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        
        System.out.println("Choose an operation: +  -  *  /");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Sum: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Difference: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Product: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Quotient: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        input.close();
    }
}
