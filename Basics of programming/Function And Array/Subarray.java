import java.io.*;
import java.util.*;
public class Subarray {    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner ( System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        for(int si = 0;si<arr.length;si++){
            for(int end = si ; end<arr.length;end++){
                for(int k = si;k<=end;k++){
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }
        
     }
    
    
