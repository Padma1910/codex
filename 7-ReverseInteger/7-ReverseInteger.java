// Last updated: 1/26/2026, 6:02:42 PM
class Solution {
    public int reverse(int x) {
        long ans=0;

        while(x !=0) {
        ans = ans * 10 + x % 10;
        x /=10;
        } 
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE)? 0:(int) ans;
    }
}