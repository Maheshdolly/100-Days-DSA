class Solution {
    public boolean isPalindrome(String s) {
      
      String x = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      int left =0; int right=x.length()-1;
      while(left<=right){
        if(x.charAt(left) != x.charAt(right)){
            return false;
        }
        left++;
        right--;
      }
      return true;
    }
}