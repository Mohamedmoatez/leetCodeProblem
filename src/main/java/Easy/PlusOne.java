package Easy;

import java.util.*;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] result = new int[digits.length + 1];
        result [0] =1;
        return result;

    }


//    public static int[] plusOne(int[] digits) {
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (digits[i] < 9) {
//                digits[i]++;
//                return digits; // No carry needed, done!
//            }
//            digits[i] = 0; // Set current to 0 and continue loop to add carry
//        }
//
//        // If all digits were 9 (e.g., [9,9,9]), we need one more digit at the front
//        int[] result = new int[digits.length + 1];
//        result[0] = 1; // e.g., from [9,9,9] -> [1,0,0,0]
//        return result;
//    }

}
