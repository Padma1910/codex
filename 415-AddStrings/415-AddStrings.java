// Last updated: 1/26/2026, 6:02:11 PM
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        return a.add(b).toString();
    }
}