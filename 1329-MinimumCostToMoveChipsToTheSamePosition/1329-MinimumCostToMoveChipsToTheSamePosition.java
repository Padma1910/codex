// Last updated: 1/26/2026, 6:01:53 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;
        for(int pos:position){
            if (pos %2==0) evenCount++;
            else oddCount++;
        }
        return (oddCount<evenCount)?oddCount:evenCount;
    }
}