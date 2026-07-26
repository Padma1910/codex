// Last updated: 7/26/2026, 8:44:04 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s>9*n){
4            return -1;
5        }
6        StringBuilder res=new StringBuilder();
7        for(int i=0;i<n;i++){
8            if(s>=9){
9                res.append(9);
10                s-=9;
11            }else{
12                res.append(s);
13                s=0;
14            }
15        }return Integer.parseInt(res.toString());
16    }
17}