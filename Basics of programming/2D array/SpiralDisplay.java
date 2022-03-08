public class SpiralDisplay {
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];

        for(int i = 0; i<n ;i++){
            for(int j = 0; j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;
        int tp = n*m;
        int count = 0;
        //left wall
        while(count<tp){
            if (count < tp){
                for(int i = minr;i<=maxr;i++){
                    System.out.println(arr[i][minc]);
                    count++;
                }
                minc++; 
            }
            if (count < tp){
                //bottom wall
                for(int i = minc;i<=maxc;i++){
                    System.out.println(arr[maxr][i]);
                    count++;
                }
                maxr--;
            }
            if (count < tp){
                //rght wall
                    for(int i = maxr;i>=minr;i--){
                    System.out.println(arr[i][maxc]);
                    count++;
                }
                maxc--;
            }
            if (count < tp){
                //top wall
                for(int i = maxc;i>=minc;i--){
                    System.out.println(arr[minr][i]);
                    count++;
                }
                minr++;
            }
        }
    }

}
