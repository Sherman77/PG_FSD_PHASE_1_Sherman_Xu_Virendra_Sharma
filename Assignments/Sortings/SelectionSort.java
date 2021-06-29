package Sortings;

public class SelectionSort {

    public static void sSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 1, 2, 0, 9};
        sSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
