// Last updated: 2/15/2026, 8:24:28 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
5        Set<Integer> onBulbs = new HashSet<>();
6        
7        for (int b : bulbs) {
8            if (onBulbs.contains(b)) {
9                onBulbs.remove(b);  
10            } else {
11                onBulbs.add(b);   
12            }
13        }
14        
15        List<Integer> result = new ArrayList<>(onBulbs);
16        Collections.sort(result);
17        
18        return result;
19    }
20}
21