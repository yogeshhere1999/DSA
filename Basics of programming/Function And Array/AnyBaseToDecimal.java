public class AnyBaseToDecimal {
    
    import java.util.*;
  
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
     }
    
     public static int getValueIndecimal(int n, int b){
        // write your code here
        int tp =1;
        int sum = 0;
        while(n!=0){
           int r = n%10;
           n = n/10;
           sum += r*tp;
           tp = tp*b;
        }
        return sum;
     }
    }
