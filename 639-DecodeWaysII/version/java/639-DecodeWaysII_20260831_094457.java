// Last updated: 8/31/2026, 9:44:57 AM
1/**
2 * Dynamic Programming
3 *
4 * DP[i] = Number of ways to decode the string from 0 to i.
5 *
6 * DP[i] = DP[i-1] (when i is from 1 to 9) + DP[i-2] (when (i-1,i) is from 10 to
7 * 26)
8 *
9 * Based on star calculate the number of decodings possible.
10 *
11 * Time Complexity: O(N)
12 *
13 * Space Complexity: O(1)
14 *
15 * N = Length of the input string.
16 */
17class Solution {
18    public int numDecodings(String s) {
19        if (s == null) {
20            throw new IllegalArgumentException("Input string is null");
21        }
22        if (s.length() == 0 || s.charAt(0) == '0') {
23            return 0;
24        }
25
26        long pre = 1; // dp[i-2]
27        long cur = s.charAt(0) == '*' ? 9 : 1; // dp[i-1]
28
29        for (int i = 1; i < s.length(); i++) {
30            long sum = 0; // dp[i]
31            char curChar = s.charAt(i);
32            char preChar = s.charAt(i - 1);
33
34            if (curChar != '0') {
35                sum = cur * (curChar == '*' ? 9 : 1);
36            }
37            if (preChar == '*') {
38                if (curChar == '*') {
39                    sum += pre * 15;
40                } else if (curChar <= '6') {
41                    sum += pre * 2;
42                } else {
43                    sum += pre;
44                }
45            } else {
46                if (curChar == '*') {
47                    if (preChar == '1') {
48                        sum += pre * 9;
49                    } else if (preChar == '2') {
50                        sum += pre * 6;
51                    }
52                } else {
53                    int num = Integer.parseInt(s.substring(i - 1, i + 1));
54                    if (num >= 10 && num <= 26) {
55                        sum += pre;
56                    }
57                }
58            }
59
60            pre = cur;
61            cur = sum % 1000000007;
62        }
63
64        return (int) cur;
65    }
66}