// Last updated: 6/28/2026, 8:44:54 AM
1class Solution {
2    public long maxSum(int[] nums, int k, int mul) {
3        Arrays.sort(nums);
4        long ans=0;
5        int n=nums.length;
6        int t=Math.min(k,Math.max(0,mul-1));
7        for(int i=0;i<t;i++){
8            ans+=1L * nums[n-1-i]*(mul-i);
9            
10        }
11        for(int i=t;i<k;i++){
12            ans=ans+nums[n-1-i];
13        }return ans;
14    }
15}