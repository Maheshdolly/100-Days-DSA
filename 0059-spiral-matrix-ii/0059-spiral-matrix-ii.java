class Solution {
    public int[][] generateMatrix(int n) {
        int c1 = 0, c2 = n - 1;
        int r1 = 0, r2 = n - 1;
        
        int[][] arr = new int[n][n];
        int value = 1; // Start from 1 instead of 0 for a typical spiral matrix
        
        while (c1 <= c2 && r1 <= r2) {
            // left to right
            for (int c = c1; c <= c2; c++) arr[r1][c] = value++;
            r1++;
            
            // top to bottom
            for (int r = r1; r <= r2; r++) arr[r][c2] = value++;
            c2--;
            
            // right to left
            if (r1 <= r2) {
                for (int c = c2; c >= c1; c--) arr[r2][c] = value++;
                r2--;
            }
            
            // bottom to top
            if (c1 <= c2) {
                for (int r = r2; r >= r1; r--) arr[r][c1] = value++;
                c1++;
            }
        }
        
        return arr;
    }
    }
