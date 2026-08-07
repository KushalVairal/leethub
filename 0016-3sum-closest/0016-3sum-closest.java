class Solution {
    public int threeSumClosest(int[] nums, int target) {
    int n = nums.length;
    Arrays.sort(nums);
    int closestSum = nums[0] + nums[1] + nums[2];
    if(n<3) return -1;
     for(int i = 0; i<n-2;i++){
        if(i>0 && nums[i]==nums[i-1]) continue;
        int j = i+1;
        int k = n-1;
        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum==target){
                return sum;
            }
            if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                closestSum = sum;
            }
            if (sum > target) {
                k--;
            } else {
                j++;
            }
        }
     } 
        return closestSum;
    }  
}