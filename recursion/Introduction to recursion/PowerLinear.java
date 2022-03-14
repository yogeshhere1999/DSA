
import java.util.*;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner ( System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int ans = power(x,n);
        System.out.println(ans);

    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int ans = x*power(x,n-1);
        return ans;
    }

}