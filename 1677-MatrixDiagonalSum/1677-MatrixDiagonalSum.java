// Last updated: 1/26/2026, 6:01:45 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += mat[i][i] + mat[i][n - i - 1];
        }
        if (n % 2 == 1) {
            result -= mat[n / 2][n / 2];
        }
        return result;
    }
}