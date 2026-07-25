// Last updated: 7/25/2026, 9:33:35 AM
1class Solution {
2    public int numDistinct(String s, String t) {
3
4        int n = s.length();
5        int m = t.length();
6
7        int[][] dp = new int[n][m];
8        for (int[] row : dp)
9            Arrays.fill(row, -1);
10
11        return count(dp, n - 1, m - 1, s, t);
12    }
13
14    private int count(int[][] dp, int i, int j, String s, String t) {
15
16        if (j < 0) return 1;
17        if (i < 0) return 0;
18
19        if (dp[i][j] != -1)
20            return dp[i][j];
21
22        if (s.charAt(i) == t.charAt(j))
23            return dp[i][j] =
24                    count(dp, i - 1, j - 1, s, t)
25                  + count(dp, i - 1, j, s, t);
26
27        return dp[i][j] =
28                count(dp, i - 1, j, s, t);
29    }
30}