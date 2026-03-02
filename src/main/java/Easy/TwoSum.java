package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};

        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }


//    public static int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//
//        }
//        return new int[0];
//    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementsIndex = complements.put(nums[i], i);
            if (complementsIndex != null) {
                return new int[]{complementsIndex, i};
            }
         complements.put(target - nums[i], i);
        }
        return new int[0];
    }
}
