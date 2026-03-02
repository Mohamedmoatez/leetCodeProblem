package Easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }


//    public static int singleNumber(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            map.put(i, nums[i]);
//        }
//        for (int i = 0; i < map.size(); i++) {
//            if (map.containsValue(map.get(i))) {
//                count++;
//                if (count > 1){
//                   return map.get(i);
//                }
//            }
//        }
//        System.out.println(map);
//        return 0;
//    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);

        // Find the number that occurs only once
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If all numbers appear twice (should not happen by problem statement)
        return -1;
    }


}
