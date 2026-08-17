class Solution {
    public String getPermutation(int n, int k) {
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        char[] arr = sb.toString().toCharArray();

        
        int count = 1;
        while (count < k) {
            nextPermutation(arr);
            count++;
        }
        
        return new String(arr);
    }

    
    private void nextPermutation(char[] nums) {
        int i = nums.length - 2;
        
        
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(char[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}