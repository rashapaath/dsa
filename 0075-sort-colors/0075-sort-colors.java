class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length - 1);

    }

    public void quicksort(int[] nums, int l, int h) {
        if (l < h) {
            int partition = partition(nums, l, h);
            quicksort(nums, l, partition - 1);
            quicksort(nums, partition + 1, h);
        }
    }

    public int partition(int[] nums, int l, int h) {
        int pivot = nums[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (nums[i] <= pivot && i <= h - 1) {
                i++;
            }
            while (nums[j] > pivot && j >= l + 1) {
                j--;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[j];
        nums[j] = nums[l];
        nums[l] = temp;
        return j;
    }
}