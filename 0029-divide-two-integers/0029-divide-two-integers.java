class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor== -1) return Integer.MAX_VALUE;
        
        boolean isNegative = (dividend < 0)^(divisor <0);

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        long quotient  =0;
        while(absDivisor <= absDividend){
            long temp = absDivisor;
            long multiple = 1;
            while(absDividend >= (temp<<1)){
                temp <<= 1;
                multiple <<= 1;
            }
            absDividend -= temp;
            quotient += multiple;
        }

        int res =  (int) (isNegative? -quotient : quotient );
        return res;
    }
}