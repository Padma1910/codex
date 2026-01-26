// Last updated: 1/26/2026, 6:02:10 PM
class Solution {
    public int arrangeCoins(int n) {
        int block=1;
        while(n>=block){
          n-=block;
          block++;
        }
        return block-1;
        
    }
}