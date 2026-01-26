// Last updated: 1/26/2026, 6:01:20 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int total = numOnes+numZeros+numNegOnes;
        if (k<=numOnes){
            return k;
        }
        if (k<= (numOnes + numZeros)){
            return numOnes;
        }
        else{
            int rem= k-(numOnes + numZeros);
            return numOnes-rem;
        }
        
    }
}