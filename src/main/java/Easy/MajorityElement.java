package Easy;

import java.util.HashMap;

public class MajorityElement {


    public static void main(String[] args) {

        int[] arr = {3, 2, 3};

        System.out.println(majorityElement(arr));


    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (!map.containsKey(currentNum)){
                map.put(currentNum,1);
            }else {
                map.put(currentNum,map.get(currentNum)+1);
            }
        }
        int majorityThreshold = nums.length / 2;
        for (int num : map.keySet()){
            if (map.get(num) > majorityThreshold){
                return num;
            }
        }
        return -1;

    }
}
