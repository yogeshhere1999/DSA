import java.io.*;
import java.util.*;
public class DuplicteBracket {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner ( System.in);
        String str = scn.nextLine();
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(stack.peek()=='('){
                    System.out.println("true");
                    return ;
                }

            else{while(stack.peek()!='('){
                stack.pop();
                
            }
            stack.pop();
            }
            }else{
                stack.push(ch);
            }
        }


    
    
 System.out.println("false");

}
}

