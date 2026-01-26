// Last updated: 1/26/2026, 6:01:49 PM
class Solution {
    public int numberOfSteps(int num) {
        int steps =0;
        while(num!=0){
            if(num%2==0 ) num = num/2;
            else num = num-1;
            steps++;
        }
        return steps;
        
    }
}