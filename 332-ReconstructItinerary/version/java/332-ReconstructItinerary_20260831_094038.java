// Last updated: 8/31/2026, 9:40:38 AM
1class Solution {
2    public int strongPasswordChecker(String s) {
3    int res = 0, a = 1, A = 1, d = 1;
4    char[] carr = s.toCharArray();
5    int[] arr = new int[carr.length];
6        
7    for (int i = 0; i < arr.length;) {
8        if (Character.isLowerCase(carr[i])) a = 0;
9        if (Character.isUpperCase(carr[i])) A = 0;
10        if (Character.isDigit(carr[i])) d = 0;
11            
12        int j = i;
13        while (i < carr.length && carr[i] == carr[j]) i++;
14        arr[j] = i - j;
15    }
16        
17    int total_missing = (a + A + d);
18
19    if (arr.length < 6) {
20        res += total_missing + Math.max(0, 6 - (arr.length + total_missing));
21            
22    } else {
23        int over_len = Math.max(arr.length - 20, 0), left_over = 0;
24        res += over_len;
25            
26        for (int k = 1; k < 3; k++) {
27            for (int i = 0; i < arr.length && over_len > 0; i++) {
28                if (arr[i] < 3 || arr[i] % 3 != (k - 1)) continue;
29                arr[i] -= Math.min(over_len, k);
30                over_len -= k;
31            }
32        }
33            
34        for (int i = 0; i < arr.length; i++) {
35            if (arr[i] >= 3 && over_len > 0) {
36                int need = arr[i] - 2;
37                arr[i] -= over_len;
38                over_len -= need;
39            }
40                
41            if (arr[i] >= 3) left_over += arr[i] / 3;
42        }
43            
44        res += Math.max(total_missing, left_over);
45    }
46        
47    return res;
48}
49}