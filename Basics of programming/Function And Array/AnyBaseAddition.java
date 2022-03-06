public class AnyBaseAddition {
    
    import java.util.*;
  
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getSum(b, n1, n2);
        System.out.println(d);
     }
    
     public static int getSum(int b, int n1, int n2){
         // write ur code here
         int tp =1;
         int c = 0;
         int sum = 0;
         while(n1>0|| n2>0 || c>0){
            int d1 =  n1%10;
            int d2 = n2%10;
  
            n1=n1/10;
            n2 = n2/10;
            int d = d1+d2+c;
  
            if(d>=b){
               c=1;
               d= d-b;
  
            }else{
               c=0;
            }
            sum+=d*tp;
            tp=tp*10;
  
         }
         return sum;
     }
    }
