class Solution {
    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int colum = matrix[0].length;
        
        Set<Integer> rowSet =  new HashSet<>();
        Set<Integer> coluSet = new HashSet<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<colum; j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    coluSet.add(j);
                }
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<colum; j++){
                if(rowSet.contains(i) || coluSet.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        } 
    }
}