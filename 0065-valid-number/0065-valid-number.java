class Solution {
    public boolean isNumber(String s) {
        if(s == null ) return false;
        s= s.trim();
        int n = s.length();
        if(n==0) return false;
        boolean seenE = false;
        boolean seenDigit =  false;
        boolean seenDot = false;
        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                seenDigit = true;
            }else if(c == '+' || c=='-'){
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E'){
                    return false;
                }if(i==n-1) return false;
            }else if(c == '.'){
                if(seenDot || seenE) return false;
                seenDot = true;
            }else if(c == 'e' || c=='E'){
                if(seenE || !seenDigit) return false;
                seenE =true;
                seenDigit = false;
            }else{
                return false;  
            }
        }
        return seenDigit;
    }
}