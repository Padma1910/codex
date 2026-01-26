// Last updated: 1/26/2026, 6:02:23 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

    return (n & (n - 1)) == 0;
    }
}