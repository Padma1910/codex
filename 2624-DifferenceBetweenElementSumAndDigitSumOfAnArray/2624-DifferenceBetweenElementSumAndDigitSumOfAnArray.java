// Last updated: 1/26/2026, 6:01:26 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int digitsum =0;
        int elementsum=0;
        int diff=0;
        for(int x:nums){
            elementsum+=x;
            while(x!=0){
                digitsum+=x%10;
                x/=10;
            }
        }
        return Math.abs(elementsum-digitsum);
    }
}