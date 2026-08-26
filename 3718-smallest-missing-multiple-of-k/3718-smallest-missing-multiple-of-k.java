class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Step 1: Saare nums ko HashSet mein daalo
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Step 2: Multiples ko check karo
        int multiple = k; // first multiple of k
        while (set.contains(multiple)) {
            multiple += k; // next multiple (2k, 3k, ...)
        }
        return multiple; // first missing multiple
    }
}