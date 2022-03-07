public class inverseOfaArray {
    
    public static int[] inverse(int[] a){
        // write your code here
        int [] inv = new int[a.length];
    
        for(int i = 0;i<inv.length;i++){
            inv[a[i]] = i;
        }
        return inv;
      }
}
