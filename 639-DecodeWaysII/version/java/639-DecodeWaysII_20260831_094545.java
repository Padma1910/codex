// Last updated: 8/31/2026, 9:45:45 AM
1class Solution {
2    public int strangePrinter(String s) {
3        int n = s.length();
4        char[] sChar = s.toCharArray();
5        int[][] dp = new int[n][n];
6        for(int[] in : dp) Arrays.fill(in, -1);
7        return Util(0, n - 1, sChar, dp);
8    }
9    public int Util(int i, int j, char[] sChar, int[][] dp) {
10        if (i > j) {
11            return 0;
12        }
13
14        if(dp[i][j] != -1) return dp[i][j];
15        
16        int firstLetter = sChar[i];
17        // in case, current character is not repeated in the rest of the string
18        int answer = 1 + Util(i + 1, j, sChar, dp);
19        for (int k = i + 1; k <= j; k++) {
20            // if repeated then update the answer
21            if (sChar[k] == firstLetter) {   
22                // splitting from i -> k - 1(remove the last character)
23                // and from k + 1 -> j             
24                int betterAnswer = Util(i, k - 1, sChar, dp) + Util(k + 1, j, sChar, dp);
25                answer = Math.min(answer, betterAnswer);
26            }
27        }
28        return dp[i][j] = answer;
29    }
30}