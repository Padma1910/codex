// Last updated: 2/15/2026, 8:26:40 AM
1import java.util.*;
2
3class Solution {
4    public int firstUniqueFreq(int[] nums) {
5        
6        int[] minaveloru = nums;
7        
8        Map<Integer, Integer> freqMap = new HashMap<>();
9        for (int num : minaveloru) {
10            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
11        }
12        
13        Map<Integer, Integer> freqCount = new HashMap<>();
14        for (int freq : freqMap.values()) {
15            freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
16        }
17        
18        // Step 3: Find first element with unique frequency
19        for (int num : minaveloru) {
20            int frequency = freqMap.get(num);
21            if (freqCount.get(frequency) == 1) {
22                return num;
23            }
24        }
25        
26        return -1;
27    }
28}
29
30