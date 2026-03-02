package Easy;

public class HappyNumber {


    public static void main(String[] args) {
        int num = 2;
        System.out.println(isHappy(num));
    }


    public static boolean isHappy(int n) {
//        Because 4 is the "gateway" to the unhappy cycle. Once any number reaches 4, it's guaranteed to never reach 1.
        while (n != 1 && n != 4) {
            int sum = 0;

            // Calculate sum of squares of digits
            while (n > 0) {
                int digit = n % 10;   // Get last digit
                sum += digit * digit; // Square it and add to sum
                n = n / 10;  // Remove last digit
            }

            n = sum;
        }

        return n == 1;
    }
}
