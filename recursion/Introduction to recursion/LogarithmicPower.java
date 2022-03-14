import java.io.*;
import java.util.*;

public class LogarithmicPower{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x,n);
        System.out.println(ans);

    }

    public static int power(int x, int n){
        if(n == 0 ){
            return 1;
        }
        
        return n%2==0?power(x,n/2)*power(x,n/2):x*power(x,n/2)*power(x,n/2);
    }

}