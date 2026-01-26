// Last updated: 1/26/2026, 6:01:30 PM
class Solution {
public:
    int averageValue(vector<int>& nums) {
        int sum=0;
        int count=0;
        for(int x:nums){
            if(x%2==0 && x%3==0){
                sum+=x;
                count++;
            }
        }
        return (count==0)?0:sum/count;
    }
};