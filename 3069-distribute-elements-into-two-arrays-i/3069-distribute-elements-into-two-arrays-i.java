class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        if(n<=2) return nums;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i = 2; i<n ; i++){
            if(arr1.get(arr1.size()-1) >= arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        arr1.addAll(arr2);
        int[] res = new int[arr1.size()];
        int i= 0;
        while(i<arr1.size()){
            res[i] = arr1.get(i);
            i++;
        }
        //  return Stream.concat(arr1.stream(), arr2.stream()).mapToInt(Integer::intValue).toArray();
        return res;
    }
}