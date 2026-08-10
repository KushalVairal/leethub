class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length==0) return "";
        Arrays.sort(strs);
        String frist = strs[0];
        String last = strs[strs.length -1];
        int i =0;
        while(i<frist.length()&&i<last.length()&& frist.charAt(i)==last.charAt(i)){
            i++;
        }
        return frist.substring(0,i);
    }
}