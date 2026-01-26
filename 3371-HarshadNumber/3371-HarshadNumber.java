// Last updated: 1/26/2026, 6:01:09 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int cpy=x;
        while(x>0){
            sum+=x%10; 
            x/=10;
        }
        if(cpy%sum==0){
            return sum;
        } 
        return -1;
    }
}