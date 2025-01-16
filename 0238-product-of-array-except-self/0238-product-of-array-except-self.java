class Solution {
    public int[] productExceptSelf(int[] nums) {

       if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length];
        int rp = 1;

        // Left pass
        for (int i = 0; i < nums.length; i++) {
            result[i] = rp;
            rp *= nums[i];
        }

        rp = 1;
        // Right pass
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rp;
            rp *= nums[i];
        }

        return result;
       
    }
  
}