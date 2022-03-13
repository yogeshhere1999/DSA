package Basics of programming.String,StringBuilderAndArrayList.java;

public class RemovePrimes {
   

	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i = al.size()-1;i>=0;i--){
			if(isPrime(al.get(i))){
				al.remove(i);
			}
		}
	}

	public static boolean isPrime(int i){

		for(int div = 2; div*div<=i;div++){
			int r = i%div;
			
			if(r==0){
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
