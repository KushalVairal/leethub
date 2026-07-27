class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        String[] words = s.trim().split("\\s+");
        return (words[(words.length)-1]).length();
        

    }
}