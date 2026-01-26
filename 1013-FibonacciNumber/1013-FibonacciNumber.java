// Last updated: 1/26/2026, 6:02:00 PM
class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;
        int prev=0;
        int prev2=1;
        int next =0;
        for (int i=1;i<n;i++){
            next = prev+prev2;
            prev=prev2;
            prev2=next;
        }
        return next;
    }
}