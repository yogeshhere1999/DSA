import java.util.*;
import java.io.*;
public class IsANumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
         // write ur code here
         int t = scn.nextInt();
       
  
         for(int i = 1 ; i<=t ; i++){
               int n = scn.nextInt();
             int div = 2;
              boolean IsPrime = true; 
             while(div*div<=n){
                 int r = n%div;
                 if(r==0){
                     IsPrime = false;
                     break;
                 }
                 div++;
             }
  
             if(IsPrime == true){
                 System.out.println("prime");
             }else{
                 System.out.println("not prime");
             }
         }
  
    
     }
    
}
