public class FirstAndLastIndex {
    import java.io.*;
import java.util.*;



public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner ( System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i<n;i++){
        arr[i] = scn.nextInt();
    }

    int d = scn.nextInt();

//    int i =0;
//    int j = arr.length -1;
//    int s = 0;
//    int e = 0;
//    while(i<j){
//        if(arr[i]==d && arr[j]==d ){
//            s=i;
//            e=j;
//            break;
       
//        }
//        i++;
//        j--;
//    }
    

//         System.out.println(s);
//         System.out.println(e);


    int i =0;
    int j = arr.length -1;
    int fi = -1;
    while(i<=j){
        int mid = (i+j)/2;
        if(d>arr[mid]){
            i = mid+1;
        }else if(arr[mid]>d){
            j = mid-1;
        }else if(d==arr[mid]){
            fi= mid;
            j = mid-1;

        }
    }

    System.out.println(fi);


    int k =0;
    int p = arr.length -1;
    int li = -1;
    while(k<=p){
        int mid = (k+p)/2;
        if(d>arr[mid]){
            k = mid+1;
        }else if(arr[mid]>d){
            p = mid-1;
        }else if(d==arr[mid]){
            li= mid;
            k = mid+1;

        }
    }

    
     System.out.println(li);

 }
}
