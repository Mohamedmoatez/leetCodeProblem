package Easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2,3,3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        if (nums.length == 0) return false;

        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            if (integerMap.containsKey(digit)) {
                return true;
            } else {
                integerMap.put(digit, digit);
            }
        }
        return false;
    }
}
