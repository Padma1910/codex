// Last updated: 8/31/2026, 9:43:12 AM
1class Solution {
2
3    public int findMinStep(String board, String hand) {
4        char[] handArr = hand.toCharArray();
5        Arrays.sort(handArr);
6
7        return dfs(board, new String(handArr), new HashMap<>());
8    }
9
10    private int dfs(String board, String remainingHand, HashMap<String, Integer> memo) {
11        if (board.isEmpty()) return 0;
12        if (remainingHand.isEmpty()) return -1;
13
14        String key = board + '#' + remainingHand;
15        if (memo.containsKey(key)) {
16            return memo.get(key);
17        }
18
19        int best = Integer.MAX_VALUE;
20
21        for (int i = 0; i < remainingHand.length(); i++) {
22            if (i > 0 && remainingHand.charAt(i) == remainingHand.charAt(i-1)) {
23                continue;
24            }
25
26            char ball = remainingHand.charAt(i);
27            String newHand = remainingHand.substring(0, i) + remainingHand.substring(i + 1);
28
29            for (int pos = 0; pos <= board.length(); pos++) {
30                if (!isGoodPlace(board, pos, ball)) {
31                    continue;
32                }
33
34                String newBoard = board.substring(0, pos) + ball + board.substring(pos);
35                String collapsedBoard = collapse(newBoard);
36                
37                int sub = dfs(collapsedBoard, newHand, memo);
38                if (sub != -1) {
39                    best = Math.min(best, sub + 1);
40                }
41            }
42        }
43
44        int result = (best == Integer.MAX_VALUE)? -1: best;
45        memo.put(key, result);
46        return result;
47    }
48
49    private boolean isGoodPlace(String board, int pos, char ball) {
50        if (pos > 0 && board.charAt(pos - 1) == ball) {
51            return true;
52        }
53
54        if (pos > 0 && pos < board.length()
55                    && board.charAt(pos - 1) == board.charAt(pos)) {
56            return true;
57        }
58
59        return false;
60    }
61
62    private String collapse(String board) {
63        int i = 0;
64        while (i < board.length()) {
65            int j = i;
66            while (j < board.length() && board.charAt(j) == board.charAt(i)) {
67                j++;
68            }
69
70            if (j - i >= 3) {
71                String newBoard = board.substring(0, i) + board.substring(j);
72                return collapse(newBoard);
73            } else {
74                i = j;
75            }
76        }
77
78        return board;
79    }
80}