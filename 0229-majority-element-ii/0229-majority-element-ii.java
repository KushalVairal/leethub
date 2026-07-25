class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int cnt1 =0;
        int cnt2= 0;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i<n ; i++){
            if(cnt1==0 && nums[i]!= el2){
                cnt1=1;
                el1 = nums[i];
            }else if(cnt2==0 && nums[i]!= el1){
                cnt2 =1;
                el2 = nums[i];
            }else if(nums[i]==el1){
                cnt1++;
            }else if(nums[i]==el2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }

        }
            int count1 =0;
            int count2 =0;
        for(int x : nums){
            if(x== el1){
                count1++;
            }
             if(x== el2){
                count2++;
            }

        }
            int check = (int) (n/3)+1;
            if(count1>=check) res.add(el1);
            if(count2>= check) res.add(el2);
        return res;
    }
}