class Solution {
    public boolean validPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else{
              return isPalindorne(s, left+1 , right)
             || isPalindorne(s, left, right-1);
            }
          }
         return true;
        }    
    

    public boolean isPalindorne(String s, int left, int right){
        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
               return false;
            } 
        }
        return true;
    }
}