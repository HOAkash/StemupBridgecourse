import java.util.Scanner;

    public class D3_9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int count = countA(input);
        System.out.println("The letter 'a' or 'A' appears " + count + " times.");
    }

    public static int countA(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }
}


    

