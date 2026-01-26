// Last updated: 1/26/2026, 6:01:12 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rem = purchaseAmount%10;
        if (rem <5){
           purchaseAmount = purchaseAmount - rem;
        }
        else{ 
            purchaseAmount = purchaseAmount + (10-rem);
        }
        return (100-purchaseAmount); 
    }
}