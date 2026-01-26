// Last updated: 1/26/2026, 6:01:42 PM
class Solution {
    public int arraySign(int[] nums) {
        int neg=0;
        for(int x:nums){
            if(x==0) return 0;
            if(x<0) neg++;
        }
        return neg%2==0?1:-1;
    }
}