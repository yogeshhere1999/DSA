
 import java.io.*;
 import java.util.*;
public class TheStaeOfWakanda {
   
    
    
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
    
    
        int[][] arr = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
    
        for(int col = 0; col<m;col++){
            if(col%2==0){
                for(int i =0; i<n;i++){
                    System.out.println(arr[i][col]) ;
                }
            }else{
                 for(int i =arr.length-1; i>=0;i--){
                    System.out.println(arr[i][col]) ;
                }
            }
        }
    
    
    
    
    
    
     }
    
    }
