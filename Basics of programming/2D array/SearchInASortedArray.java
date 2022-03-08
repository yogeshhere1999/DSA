
import java.io.*;
import java.util.*;

public class SearchInASortedArray {
    


    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i<n ;i++){
            for(int j = 0; j<n ; j++){
            arr[i][j] = scn.nextInt();
        }
        }

        int d = scn.nextInt();
        int i = 0;
        int j = arr[0].length-1;
    

         while(i<arr.length && j>=0){
            if(d==arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return ;

            }else if (d > arr[i][j]){
                i++;
            }else if(d<arr[i][j]){
                j--;
            }
        
        }

        System.out.println("Not Found");

    }

}
