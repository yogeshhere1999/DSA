public class FindElementInArray {
    
    import java.io.*;
    import java.util.*;
    
    
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        //     LINEAR SEARCH
        for(int i = 0;i<arr.length ;i++){
            if(arr[i]==tar){
                System.out.print(i);
                break;
            } else if(i == n-1){
                if(tar!=arr[i]){
                     System.out.print("-1");
                     break;
                }
            }
        }
    
            //Binart search
            // int i =0;
            // int j = n-1;
            // int c = Integer.MAX_VALUE;
            // while(i<j){
            //     int mid = (i+j)/2;
            //     if(arr[mid]==tar){
            //         System.out.println(mid);
            //         c = mid;
            //         break;
            //     }else if(tar>arr[mid]){
            //         i = mid+1;
            //     }else{
            //         j = mid-1;
            //     }
            //     // else if(mid<0 || mid==n-1){
            //     //      System.out.println("-1");
            //     //      break;
            //     // }
            //     if( c == Integer.MAX_VALUE){
            //         System.out.println("-1");
            //     }
    
            // }
    
            
    
    
    
           
    
    
    
    
     }
    
    }
