class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) { 
        int n = nums.length;
        ArrayList<List<Integer>> res = new ArrayList<>();
        if(n<4) return res;
        Arrays.sort(nums);
        for(int i =0 ; i<n-3 ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j =i+1 ;j<n-2;j++){
                if(j!=(i+1) && nums[j]==nums[j-1]) continue;
                int l =j+1;
                int k = n-1;
                while(l<k){
                long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum ==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[l],nums[k]));
                        l++;
                        k--;
                        while(l<k && nums[k]==nums[k+1]) k--;
                        while(l<k && nums[l]==nums[l-1])l++;
                    }else if(sum> target){
                            k--;
                    } else{
                        l++;
                    }
                }
            }
        }
        return res;
    }
}