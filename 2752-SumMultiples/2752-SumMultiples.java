// Last updated: 1/26/2026, 6:01:18 PM
class Solution {
    public int sumOfMultiples(int n) {
        int sum1=0;
        for(int i=0;i<=n;i++){
           if(i%3==0 || i%5==0 || i%7==0){
             sum1+=i;
           }
        }
        return sum1;
    }
}