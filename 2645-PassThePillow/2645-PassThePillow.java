// Last updated: 1/26/2026, 6:01:23 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = time/(n-1);
        int rem=time%(n-1);
        if (cycle%2==1){
            return n-rem;
        }
        else{
            return rem+1;
        }
        
    }
}