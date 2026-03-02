package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        res.clear();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[k]);
                        if (!result.contains(res)) {
                            result.add(new ArrayList<>(res));
                            res.clear();
                        }

                    }
                }
            }
        }
        return result;
    }
}
