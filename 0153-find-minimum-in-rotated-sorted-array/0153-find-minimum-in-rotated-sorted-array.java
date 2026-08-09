class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int h =nums.length -1;
        // int min = nums[0];
        while(l<h){
            int mid= l + (h-l)/2;
             if(nums[mid]> nums[h]){
                // min = Math.min(min , nums[l] );
                l= mid+1;
             }else if(nums[mid]<nums[h]){
                // min = Math.min(min,nums[mid]);
                h= mid;
             }
        }
        return nums[l];
    }
}