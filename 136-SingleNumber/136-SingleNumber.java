// Last updated: 1/26/2026, 6:02:33 PM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }
}