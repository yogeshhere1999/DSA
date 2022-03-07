public class SubsetsOfArray {
    
    import java.io.*;
    import java.util.*;
    
    
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
        int lim = (int)Math.pow(2,arr.length);
    
        for(int i = 0;i<lim;i++){
           String s = "";
           int temp = i;
           for(int j = arr.length-1;j>=0;j--){
              int r = temp%2;
              temp = temp/2;
    
              if(r==0){
                 s = "-\t"+s;
              }else{
                 s = arr[j]+"\t"+s;
              }
           }
           System.out.print(s);
           System.out.println();
        }
    
        
     }
    
    }
