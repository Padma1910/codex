// Last updated: 1/26/2026, 6:01:04 PM
class Solution {
    public String largestEven(String s) {
        int lastIndex = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                lastIndex = i;
                break;
            }
        }

        if (lastIndex == -1) {
            return "";
        }

        return s.substring(0, lastIndex + 1);
    }
}