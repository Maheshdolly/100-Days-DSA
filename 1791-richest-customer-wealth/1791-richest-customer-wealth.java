class Solution {
    public int maximumWealth(int[][] accounts) {
       
        int max = 0;
        for(int i=0; i<accounts.length; i++){
            int current =0;
            for(int j=0; j<accounts[i].length; j++){
               current = current + accounts[i][j];
                max = Math.max(max , current);
            }
        }
        return max;
    }
}