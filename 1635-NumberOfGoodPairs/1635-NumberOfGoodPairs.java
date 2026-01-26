// Last updated: 1/26/2026, 6:01:46 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}