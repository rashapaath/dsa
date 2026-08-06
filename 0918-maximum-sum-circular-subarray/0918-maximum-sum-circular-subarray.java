class Solution {

    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;

        int[] maxSuffix = new int[n];

        int suffixSum = nums[n - 1];
        maxSuffix[n - 1] = suffixSum;

        for (int i = n - 2; i >= 0; i--) {
            suffixSum += nums[i];
            maxSuffix[i] = Math.max(maxSuffix[i + 1], suffixSum);
        }

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int prefix = 0;
        int circularMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            sum += nums[i];
            maxi = Math.max(maxi, sum);

            if (sum < 0)
                sum = 0;

            prefix += nums[i];

            if (i != n - 1)
                circularMax = Math.max(circularMax,
                        prefix + maxSuffix[i + 1]);
        }

        return Math.max(maxi, circularMax);
    }
}