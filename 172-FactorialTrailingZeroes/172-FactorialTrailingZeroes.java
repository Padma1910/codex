// Last updated: 1/26/2026, 6:02:29 PM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
}