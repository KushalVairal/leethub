class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return true;
            }
            
            // 🔥 CRUCIAL: Duplicate handling
            // Jab nums[mid] == nums[left], humein nahi pata ki kaunsa half sorted hai
            // Isliye left ko ek step aage badhao (duplicate skip karo)
            if (nums[mid] == nums[left]) {
                left++;
            }
            // Left half sorted hai
            else if (nums[mid] > nums[left]) {
                // Kya target left half mein hai?
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half sorted hai
            else {
                // Kya target right half mein hai?
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}