// Last updated: 1/26/2026, 6:01:01 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int distance1 = Math.max(x, z) - Math.min(x, z);
        int distance2 = Math.max(y, z) - Math.min(y, z);
        if(distance1 > distance2){
            return 2;
        } else if(distance1 < distance2){
            return 1;
        } else {
            return 0;
        }
    }
}