// Last updated: 1/26/2026, 6:02:08 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int cnt=0;
        
        int c=x^y;
        // cnt setbit
        while(c>0){
            c=c&c-1;
            cnt++;
        }
        return cnt;
    }
}