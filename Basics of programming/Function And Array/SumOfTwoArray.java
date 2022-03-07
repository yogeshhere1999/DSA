public class SumOfTwoArray {
    
    import java.io.*;
    import java.util.*;
    
    
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i =0; i<n1;i++){
            arr1[i] = scn.nextInt();
        }
    
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i =0; i<n2;i++){
            arr2[i] = scn.nextInt();
        }
    
        int size = n2>n1?n2:n1;
        int[] ans = new int[size];
    
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = ans.length -1;
        int c =0;
    
        while(k>=0){
            int d = c;
            if(i>=0){
                    d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            c = d/10;
            d = d%10;
            ans[k] = d;
            i--;
            j--;
            k--;
        }
        if(c>0){
            System.out.print(c);
                }
            for(int p = 0 ; p<ans.length ;p++){
                System.out.println(ans[p]);
            }
    
     }
    
    }
