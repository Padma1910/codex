// Last updated: 1/26/2026, 6:01:08 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for(int i=0 ; i<nums.length ; i++ ){
            if(nums[i]%3 != 0){
                operations += Math.min( nums[i] % 3 , (3 - nums[i] % 3) );
            }
        }
        return operations;
    }
}