package Easy;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;           // Pointer for the end of the valid part in nums1
        int j = n - 1;           // Pointer for the end of nums2
        int k = m + n - 1;       // Pointer for the end of nums1 (total length)

        // Merge from the back to avoid overwriting elements in nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

    }

//    public static void merge(int[] nums1, int[] nums2) {
//
//        int a1 = nums1.length;
//        int a2 = nums2.length;
//        int c1 = a1 + a2;
//        int[] c = new int[c1];
//
//        System.arraycopy(nums1, 0, c, 0, a1);
//        System.arraycopy(nums2, 0, c, a1, a2);
//
//        System.out.println(Arrays.toString(c));
//
//    }


}
