class Solution {
    public int fib(int n) {
        int [] dp = new int[n+1];
        
        return fibmemo(n,dp);
    }
    
    public int fibmemo(int n , int[] dp){
        if(n == 0 || n ==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int fib1 = fibmemo(n-1,dp);
        int fib2 = fibmemo(n-2,dp);
        int fib = fib1 + fib2;
        
        dp[n] = fib;
        return dp[n];
    }
}