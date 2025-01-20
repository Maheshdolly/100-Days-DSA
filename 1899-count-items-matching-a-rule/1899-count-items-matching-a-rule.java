class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        int col =0;
         if(ruleKey.equals("color")){
            col = 1;
         }
         else if(ruleKey.equals("name")){
            col = 2;
         }

         for(int row=0; row<items.size(); row++){
            if(items.get(row).get(col).equals(ruleValue)){
                count++;
            }
         }
         return count;
    }
}