public class D2_2 {

    public static void main(String[] args) {
        String username = "akash";
        String password = "akash123";
        String enteredUsername = "akash";
        String enteredPassword = "akash123";

        boolean isValidLogin = (username.equals(enteredUsername)) && (password.equals(enteredPassword));
        System.out.println("Is login valid? " + isValidLogin);
    }
}

    

