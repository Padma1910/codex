// Last updated: 1/26/2026, 6:01:00 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int db=0;
        for (int x:nums){
            if (x<10) single+=x;
            else db+=x;
        }
        return single!=db;
    }
}