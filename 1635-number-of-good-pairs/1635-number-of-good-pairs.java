class Solution {
    public int numIdenticalPairs(int[] nums) {
     int count =0;
     Map<Integer, Integer> map = new HashMap<>();
     for(int num : nums){
        int  existing = map.getOrDefault(num , 0);
        count += existing;
        map.put(num , existing+1);
     }
     return count;
        
    }
}