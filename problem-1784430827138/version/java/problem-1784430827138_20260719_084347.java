// Last updated: 7/19/2026, 8:43:47 AM
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3        int start1=(start[0]+start[1]) %2;
4        int target1=(target[0]+target[1]) %2;
5        return start1==target1;
6    }
7}