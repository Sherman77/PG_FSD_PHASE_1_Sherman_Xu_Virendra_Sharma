package Sortings;

import java.util.Arrays;

public class ExponentialSearch {

    public static int eSearch(int[] nums, int target) {
        if (nums[0] == target) {
            return 0;
        }
        int index = 1;
        while (index < nums.length && nums[index] <= target) {
            index *= 2;
        }

        return Arrays.binarySearch(nums, index / 2, Math.min(index, nums.length - 1), target);
    }

    public static void main(String[] args) {
        int[] nums = {6, 12, 18, 24, 32};
        int result = eSearch(nums, 18);
        if (result == -1) {
            System.out.println("Target did not find");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
