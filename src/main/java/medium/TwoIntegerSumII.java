package medium;

import java.util.Arrays;
import java.util.Stack;

public class TwoIntegerSumII {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }


//    public static int[] twoSum(int[] numbers, int target) {
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    return new int[]{numbers[i], numbers[j]};
//                }
//            }
//        }
//        return new int[0];
//    }


    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // return positions (1-indexed)
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }



}
