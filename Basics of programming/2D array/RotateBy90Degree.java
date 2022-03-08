public class RotateBy90Degree {
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        // TRANSPOSE
        for(int i = 0 ; i<n;i++){
            for(int j = i;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        

        //REVERSE
        for(int j=0;j<n;j++){
            int left = 0;
            int right = arr[0].length-1;

            while(left<right){
                int temp = arr[j][left];
                arr[j][left]= arr[j][right];
                arr[j][right] = temp;

                left++;
                right--;
            }
        }

        display(arr);

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

