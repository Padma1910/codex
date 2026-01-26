// Last updated: 1/26/2026, 6:01:06 PM
import java.util.Arrays;

class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int smallSum = 0;
        int largeSum = 0;

        for (int i = 0; i < k; i++) {
            smallSum += nums[i];
            largeSum += nums[nums.length - 1 - i];
        }
        return Math.abs(largeSum - smallSum);
    }
}