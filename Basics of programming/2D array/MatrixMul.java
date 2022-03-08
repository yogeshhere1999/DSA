
 import java.io.*;
 import java.util.*;
 public class MatrixMul {
   



public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner ( System.in);
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int [][] arr1 = new int[n1][m1];

    for(int i = 0;i<n1;i++){
        for(int j = 0;j<m1;j++){
            arr1[i][j] = scn.nextInt();
        }
    }


    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int [][] arr2 = new int[n2][m2];

    for(int i = 0;i<n2;i++){
        for(int j = 0;j<m2;j++){
            arr2[i][j] = scn.nextInt();
        }
    }

    if(m1!=n2){
        System.out.println("Invalid input");
        return;
    }


    int [][]ans = new int[n1][m2];
    for(int i  =0; i<ans.length;i++){
        for(int j = 0;j<ans[0].length;j++){
            for(int k =0;k<m1;k++){
                ans[i][j] += arr1[i][k]*arr2[k][j];
            }
        }
    }

    for(int i  =0; i<ans.length;i++){
        for(int j = 0;j<ans[0].length;j++){
            System.out.print(ans[i][j]+" ");
        }
        System.out.println();
    }
 }

}
