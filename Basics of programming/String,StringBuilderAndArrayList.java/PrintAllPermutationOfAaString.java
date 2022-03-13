public class PrintAllPermutationOfAaString {
  
    
        public static void solution(String str){
            // write your code here
            int t = factorial(str.length());
            for(int i = 0; i<t;i++){
                StringBuilder sb = new StringBuilder(str);
                    int temp = i;
                for(int div = str.length();div>=1;div--){
                    int r = temp%div;
                    
    
                    System.out.print(sb.charAt(r));
                    sb.deleteCharAt(r);
    
                    temp = temp/div;
    
    
    
                }
                System.out.println();
            }
            
        }
        public static int factorial (int n ){
            if(n == 1){
                return 1;
            }
            if(n == 0){
                return 0;
            }
            int fact = n*factorial(n-1);
            return fact;
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            solution(str);
        }
    
    }    
