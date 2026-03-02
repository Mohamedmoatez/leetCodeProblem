package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3};
        int num = 2;
        System.out.println(Arrays.toString(topKFrequent(arr, num)));


    }


    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);  // If number exists in map, add 1 to its coun
            // If it doesn't exist, start counting from 0, then add 1
        }
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int maxNum = 0;
            int maxCount = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxNum = entry.getKey();

                }
            }
            result[i] = maxNum;
            map.remove(maxNum);
        }

        return result;
    }
}
