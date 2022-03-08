
  import java.util.*;
  public class AnyBaseToAnyBase {
    
  
  
   
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
       int  destBase= scn.nextInt();
  
       int ans = basetobase(n,sourceBase,destBase);
       System.out.println(ans);
     }   
  
     public  static int basetobase(int n , int b1,int b2){
  
        int dec = b1todec(n,b1);
        int sum = dectobase(dec,b2);
  
        return sum;
     }
  
     public static int b1todec(int n , int b1){
        int s = 0;
        int tp =1;
  
        while(n!=0){
           int r = n%10;
           n = n/10;
           s+=r*tp;
           tp = tp*b1;
  
        }
        return s;
     }
  
     public static int dectobase(int dec,int b2){
         int s = 0;
        int tp =1;
  
        while(dec!=0){
           int r = dec%b2;
           dec = dec/b2;
           s+=r*tp;
           tp = tp*10;
  
        }
        return s;
  
     }
    }
