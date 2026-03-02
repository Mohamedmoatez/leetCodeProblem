package Easy;

public class RemoveDuplicatesfromSortedArray {


    public static void main(String[] args) {
        int [] nums = {1,1,2};
        int [] arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
    }
//    public static int removeDuplicates(int[] nums) {
//        int res ;
//        if(nums == null){
//            return 0;
//        }
//        List<Integer> integerList = new ArrayList<>();
//        for (int i =0 ; i<nums.length;i++){
//            int curr = nums[i];
//            if (!integerList.contains(curr)) {
//                integerList.add(nums[i]);
//            }
//        }
//        res = integerList.size();
//        return res;
//    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // k will store the count of unique elements
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];  // Move the unique element to the "next" position
                k++;  // Increment the count of unique elements
            }
        }

        return k;
    }
}
