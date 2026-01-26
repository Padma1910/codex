// Last updated: 1/26/2026, 6:02:26 PM
class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = Integer.bitCount(n);
        return count;

    }
}