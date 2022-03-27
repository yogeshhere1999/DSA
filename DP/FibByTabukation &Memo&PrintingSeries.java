import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner (System.in);
    int n =scn.nextInt();
    int fib = fibmemo(n,new int[n+1]);
    int [] dp = new int[n+1];
    int fibT = fibTab(n,dp);
    System.out.print(fibT);
    //FOR PRINTING FIB SERIES
    // for(int k = 0; k<dp.length ; k++){
    //     System.out.print(dp[k]+ " ");
    // }

 }

 public static int fibmemo(int n,int[] dp){
     if(n == 0 || n == 1){
         return n;
     }

     if(dp[n]!=0){
         return dp[n];
     }

     return dp[n] = fibmemo(n-1,dp)+fibmemo(n-2,dp) ;

 }
    
    public static int fibTab(int n , int[] dp){
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2 ; i<dp.length;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];

        
    } 

}