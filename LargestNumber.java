import java.io.*;
import java.util.*;
public class LargestNumber {
  public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      int n = scn.nextInt();
      int arr[] = new int[n];
      for(int i=0 ; i < n ; i++){
          arr[i] = scn.nextInt();
      }
    for(int i = 0 ; i < t ; i ++){
        largestNumber(arr);
        for(int j=0 ; j < n ; j++){
            System.out.print(arr[j]);
      }
    }
  }
  public static int[] largestNumber(int[] arr){
      int min = arr[0];
      int [] answer = new  int[arr.length];
      for( int i=0; i<arr.length;i++){
          if(arr[i]<min){
              min=arr[i];
          }
      }
      for(int j=0;j<arr.length;j++){
          if(arr[j]>min){
              Swap(min,arr[j]); 
              answer[j]=arr[j];  
          }
      }


      return arr;
  }
  public static void Swap(int a, int b){
      int temp = a;
      a = b;
      b = temp;
  }

}