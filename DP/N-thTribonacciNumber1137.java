public class N-thTribonacciNumber1137 {
    public int tribonacci(int n) {
        int [] dp = new int[n+1];
           return fibmemo(n,dp);
       }
       public static int fibmemo(int n , int [] dp){
           
           if(n ==0){
               return 0;
           }
           if(n == 1 || n==2 ){
               return 1;
           }
           if(dp[n]!=0){
               return dp[n];
           }
           return dp[n] = fibmemo(n-1,dp)+fibmemo(n-2,dp)+fibmemo(n-3,dp);
       } 
}
