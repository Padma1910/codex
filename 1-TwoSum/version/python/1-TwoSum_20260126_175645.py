# Last updated: 1/26/2026, 5:56:45 PM
1class Solution(object):
2    def twoSum(self, nums, target):
3        
4        for i in nums:
5            diff = target - i
6
7            if diff == i:
8                pos_i = nums.index(i)
9                nums.remove(i)
10
11                if diff in nums:
12                    pos_diff = nums.index(diff) + 1
13                    out_lst = [pos_i, pos_diff]
14                    return sorted(out_lst)
15                    break
16
17                else:
18                    nums.insert(pos_i, i)
19
20            else:
21                pos_i = nums.index(i)
22
23                if diff in nums:
24                    pos_diff = nums.index(diff)
25                    out_lst = [pos_i, pos_diff]
26                    return sorted(out_lst)
27                    break