public class BarChart {
    
    import java.io.*;
    import java.util.*;
    
    
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] a= new int[n];
        for(int i =0; i<a.length;i++){
            a[i]= scn.nextInt();
        }
    
         int max = a[0];
         for(int i =1;i<a.length;i++){
             if(a[i]>max){
                 max=a[i];
             }
         }
               for(int hi=max; hi>=1;hi--){
                   for(int i=0;i<a.length;i++){
                       if(a[i]>=hi){
                           System.out.print("*\t");
                       }else{
                           System.out.print("\t");
                       }
                      
                   }
                    System.out.println();
               }
           
    
    
    
    
     }
    
    }
