public class DiffOfTwoArray {
    
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
            int d = arr2[j]-c;
            if(i>=0){
                    d-=arr1[i];
            }
            if(d<0){
                d = d+10;
                c = 1;
            }else {
                c=0;
                d =d ;
            }
            
            
            ans[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while(ans[idx]==0){
            idx++;
        }
    
        for(int ii = idx ; ii<ans.length ; ii++){
            System.out.println(ans[ii]);
        }
    
     }
    
    }
