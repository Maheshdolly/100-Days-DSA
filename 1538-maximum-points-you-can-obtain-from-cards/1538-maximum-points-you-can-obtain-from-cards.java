class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int lsum=0 , rsum =0, maxSum =0;
        
        for(int i=0; i<k; i++){
            lsum = lsum + nums[i];
        }
          maxSum = lsum;

        for(int i=0; i<k; i++){
            lsum = lsum - nums[k-1-i];
            rsum = rsum +nums[ n-1-i];
            maxSum = Math.max(maxSum , lsum+rsum);
        }
        return maxSum;
    }
    
}