class Solution {
    public boolean isGoodArray(int[] nums) {
        int result = nums[0];
        for(int i=0; i<nums.length; i++){
            result = gcd(result, nums[i]);
        }
        return result == 1;
    }
    private int gcd(int a , int b){
        if(a==0){
         return b;
        }
        
    else{
        return gcd(b%a,a);
    }
    }
}