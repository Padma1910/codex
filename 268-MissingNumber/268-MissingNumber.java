// Last updated: 1/26/2026, 6:02:18 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int news= 0;
        for(int i = 0;i<nums.length;i++){
            news+=nums[i];
        }
    return sum-news;}
}