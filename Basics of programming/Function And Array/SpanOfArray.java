public class SpanOfArray {
    
    import java.io.*;
    import java.util.*;
    
    
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
    
        // Arrays.sort(arr);
    
        // System.out.println(arr[n-1]-arr[0]);
    
        int max = arr[0];
         for(int i = 1;i<n;i++){
            if(arr[i]>=max){
                max = arr[i];
            }
        }
    
          int min = arr[0];
         for(int i = 1;i<n;i++){
            if(arr[i]<=min){
                min = arr[i];
            }
        }
    
        System.out.println(max-min);
    
    
     }
    
    }
