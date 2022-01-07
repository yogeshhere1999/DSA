import java.util.*;

public class PrintAllPrimeTillN{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner (System.in);
        int low  = scn.nextInt();
        int high = scn.nextInt();

        for(int n = low ; n<=high ; n++){
            int div = 2;
            boolean IsPrime = true;
            while(div*div<=n){
                int r = n % div;
                if(r==0){
                    IsPrime = false ;
                    break;

                }
                div++;
            }

            if(IsPrime == true){
                System.out.println(n);
            }
        }
    }
}