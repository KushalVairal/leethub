// Booyer's Moore Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt =0;
        int cand =0;
        for(int i=0; i<n;i++){
         if(cnt == 0 ){
            cnt =1;
            cand = nums[i];
         }else if(nums[i] == cand){
            cnt++;
         }else{
            cnt--;
         }
        }
        int cnt1=0;
        for(int num : nums){
            if(num == cand){
                cnt1++;
            }
            if(cnt1 > n/2){
                return cand;
            }
        }
       return -1; 
    }
}