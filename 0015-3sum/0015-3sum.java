class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(n<3) return res;
        for(int i =0; i<n ;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j =i+1;
            int k =n-1;
            while(j<k){
                    if(nums[i]+nums[j]+nums[k]==0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(j<k && nums[k] == nums[k-1]) k--;
                        while(j<k && nums[j]==nums[j+1]) j++;
                        j++;
                        k--;
                    }else if((nums[i]+nums[j]+nums[k])>0){
                        k--;
                    }else if((nums[i]+nums[j]+nums[k])<0){
                        j++;
                    }
                }
        }
        return res;
        
    }
}