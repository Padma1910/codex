// Last updated: 1/26/2026, 6:01:50 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int rem;
        int sum=0;
        int product =1;
        while(n!=0){
            int last= n%10;
            rem = n%10;
            sum += rem;
            product *= rem;
            n/=10;

        }
        return product - sum;
    }
}