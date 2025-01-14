class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         int m = matrix.length;
     int n = matrix[0].length;

     int[] rowsMin = new int[m];
     int[] colMaxi = new int[n];

     Arrays.fill(rowsMin, Integer.MAX_VALUE);
     Arrays.fill(colMaxi, Integer.MIN_VALUE);

     for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            rowsMin[i] = Math.min(rowsMin[i], matrix[i][j]);
            colMaxi[j] = Math.max(colMaxi[j], matrix[i][j]);
        }
     }
     ArrayList<Integer> lucky = new ArrayList<>();
     for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(rowsMin[i] == matrix[i][j] && colMaxi[j] == matrix[i][j]){
               lucky.add(matrix[i][j]);
            }
        }
     }
     return lucky;
    }
}