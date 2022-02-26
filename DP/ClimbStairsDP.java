

 import java.io.*;
 import java.util.*;
 
 public class ClimbStairsDP {
   

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner ( System.in);
        int n = scn.nextInt();
        int [] dp = new int[n+1];
        System.out.print(climbmemo(n,dp));
    }

    public static int climbmemo(int n , int[] dp){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }

        return dp[n] = climbmemo(n-1,dp)+climbmemo(n-2,dp)+climbmemo(n-3,dp);
    }

}

