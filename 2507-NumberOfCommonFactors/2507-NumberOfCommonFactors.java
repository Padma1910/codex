// Last updated: 1/26/2026, 6:01:31 PM
class Solution {
    public int commonFactors(int a, int b) {
        int min = a<b?a:b;
        int count = 0;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0)
              count++;
        }
        return count;
    }
}