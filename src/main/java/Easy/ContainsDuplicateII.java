package Easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(nums, 3));
    }


    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0) return false;

        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(nums[i])) {
                int previousIndex = indexMap.get(nums[i]);
                // Check if the distance condition is satisfied
                if (Math.abs(i - previousIndex) <= k) {
                    return true;
                }
            }
            // Always update with current index (even if condition not met)
            indexMap.put(nums[i], i);
        }
        return false;
    }
}
