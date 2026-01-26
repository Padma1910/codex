// Last updated: 1/26/2026, 6:01:56 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = greatest;
            greatest = Math.max(greatest, current);
        }
        return arr;
    }
}