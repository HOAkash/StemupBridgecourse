public class D2_3 {
    
    public static void main(String[] args) {
        int num = 65;

        boolean isBetween10And20 = (num > 10) && (num < 20);
        boolean isLessThan5OrGreaterThan100 = (num < 5) || (num > 100);

        System.out.println("Is num between 10 and 20? " + isBetween10And20);
        System.out.println("Is num less than 5 or greater than 100? " + isLessThan5OrGreaterThan100);
    }
}

    

