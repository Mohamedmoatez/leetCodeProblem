package medium;

import java.util.*;

public class LongestConsecutiveSequence {


    public static void main(String[] args) {

        int[] arr = {2, 20, 4, 10, 3, 4, 5};
        int[] arr2 = {0, 3, 2, 5, 4, 6, 1, 1};
        System.out.println(longestConsecutive(arr));


    }


//    public static int longestConsecutive(int[] nums) {
//
//        List<Integer> integerList = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[i] < nums[j] && nums[j] - nums[i] == 1) && (!integerList.contains(nums[i]) || !integerList.contains(nums[j]))) {
//                    integerList.add(nums[i]);
//                    integerList.add(nums[j]);
//                }
//            }
//        }
//        return integerList.size();
//    }



    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        // Use HashSet for O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        // Check each number
        for (int num : numSet) {
            // Only start counting if this is the beginning of a sequence
            // (i.e., num-1 is not in the set)
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }





}
