
 import java.io.*;
 import java.util.*;
public class StringCompression {
   

	public static String compression1(String str){
		// write your code here

		StringBuilder s = new StringBuilder ();
		s.append(str.charAt(0));
		for(int i =1;i<str.length();i++){
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i-1);

			if(ch1 != ch2){
			 s.append(ch1);
			}

		}
		


		return s.toString();
	}

	 public static String compression2(String str){
	
		 StringBuilder s = new StringBuilder ();
		s.append(str.charAt(0));
		int count = 1;

		for(int i =1;i<str.length();i++){
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i-1);

			if(ch1 == ch2){
			 count++;
			}else{
				if(count>1)
					s.append(count);
				count = 1;
				s.append(ch1);
			}
		}
		if(count>1)
			s.append(count);
		return s.toString();	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
