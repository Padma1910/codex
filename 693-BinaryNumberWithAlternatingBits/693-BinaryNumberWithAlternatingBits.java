// Last updated: 1/26/2026, 6:02:04 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        return (x&(x+1)) ==0?true:false;
    }
}