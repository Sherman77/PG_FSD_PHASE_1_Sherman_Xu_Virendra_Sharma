package Sortings;

public class BubbleSort {

    public static void bSort(int[] nums) {
        int i = 0;
        do {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
            i++;
        } while (i < nums.length);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 1, 2, 0, 9};
        bSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
