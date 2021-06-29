package Sortings;

public class InsertionSort {

    public static void iSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > num) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = num;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 1, 2, 0, 9};
        iSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
