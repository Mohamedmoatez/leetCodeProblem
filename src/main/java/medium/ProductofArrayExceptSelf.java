package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductofArrayExceptSelf {


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6};
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }
//
//    public static int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//        List<Integer> arr = new ArrayList<>();
//        List<Integer> arr2 = new ArrayList<>();
//        int multiplayNumber = 1;
//        for (int i = 0; i < nums.length; i++) {
//            arr.add(nums[i]);
//            multiplayNumber *= arr.get(i);
//        }
//
//        for (int i = 0; i < arr.size(); i++) {
//            arr2.add(multiplayNumber/arr.get(i));
//            result[i] = arr2.get(i);
//        }
//        return result;
//    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // STEP 1: Fill result with LEFT products (prefix)
        result[0] = 1;  // Nothing to the left of position 0
        for (int i = 1; i < n; i++) {
            // Current left product = previous left product × previous number
            result[i] = result[i - 1] * nums[i - 1];
        }

        System.out.println("After prefix: " + Arrays.toString(result));
        // Output: [1, 1, 2, 6]

        // STEP 2: Multiply by RIGHT products (suffix) as we go
        int rightProduct = 1;  // Start with 1 (nothing to the right of last position)

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;  // Multiply left × right
            rightProduct = rightProduct * nums[i];  // Update right product for next iteration
        }

        System.out.println("After suffix: " + Arrays.toString(result));
        // Output: [24, 12, 8, 6]

        return result;
    }
}
