// Last updated: 1/26/2026, 6:01:28 PM
class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        int s=(int)Math.sqrt(total);
        if((s*s)==total) return s;
        else return -1;
        
    }
}