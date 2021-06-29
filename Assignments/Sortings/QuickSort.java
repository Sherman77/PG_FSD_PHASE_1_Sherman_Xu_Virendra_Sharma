package Sortings;

public class QuickSort {

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void qSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);
            qSort(nums, low, pi - 1);
            qSort(nums, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 1, 2, 0, 9};
        qSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
