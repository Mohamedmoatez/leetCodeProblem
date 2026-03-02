package medium;

import java.util.Arrays;
import java.util.Stack;

public class ContainerWithMostWater {


    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 5, 7, 8, 9,10};
        System.out.println(maxArea(arr));

    }


    public static int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;

            max = Math.max(max, area);

            // Move the smaller height pointer inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
