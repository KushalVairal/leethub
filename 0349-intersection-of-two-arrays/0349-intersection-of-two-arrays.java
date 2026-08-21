class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n  = nums1.length;
        int m = nums2.length;
        if(n>m) return intersection(nums2,nums1); //num1 chota chaiye
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int x : nums1){
            set1.add(x);
        }
        for(int x : nums2){
            set2.add(x);
        }
        set1.retainAll(set2);
        int[] res = new int[set1.size()];
        int i =0;
        for(int x : set1){
            res[i++] = x;
        }
        return res;
    }
}