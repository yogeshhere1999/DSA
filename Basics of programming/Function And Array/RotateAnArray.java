public class RotateAnArray {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k<0){
            k+=nums.length;
        }
        reverse(nums,0,nums.length-1-k);
         reverse(nums,nums.length-k,nums.length-1);
         reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums,int l , int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            
            l++;
            r--;
            
        }
    }  
}
