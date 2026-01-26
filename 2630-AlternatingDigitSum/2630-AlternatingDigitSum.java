// Last updated: 1/26/2026, 6:01:24 PM
class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int d= s.charAt(i)-'0';
            if(i%2==0) sum+=d;
            else sum -=d;
        }
        return sum; 
    }
}