
import java.io.*;
import java.util.*;
public class BrokenEconomy {
    
    
    

    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner ( System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n ;i++){
            arr[i] = scn.nextInt();
    
        }
        int d = scn.nextInt();
    
    
        int i =0;
        int j = arr.length -1;
        int ceil = -1;
        int floor = -1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]<d){
                    i = mid+1;
                    floor = arr[mid];
            }
             else if(arr[mid]>d){
                    j = mid-1;
                    ceil = arr[mid];
            }
            else{
                ceil = arr[mid];
                floor = arr[mid];
            }
        }
    
        
        System.out.println(ceil);
        System.out.println(floor);
     }
    
    }