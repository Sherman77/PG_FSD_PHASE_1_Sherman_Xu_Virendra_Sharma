package Sortings;

public class BinarySearch {
    static int bSearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int result = bSearch(nums, 23);
        if (result == -1) {
            System.out.println("Did not find the target");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
