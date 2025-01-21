class Solution {
    public int largestAltitude(int[] gain) {
        int highest =0;
        int current = 0;
        
        for(int change : gain ){
            current += change;
            if(current > highest){
                highest = current; 
            }
        }
        return highest;
    }
}