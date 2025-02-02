class Solution {
    public String reverseWords(String s) {
     
     String[] words = s.split(" ");
     StringBuilder sb = new StringBuilder();
     for(String word : words){
        StringBuilder reversWords = new StringBuilder(word).reverse();
        sb.append(reversWords).append(" ");
     }
      sb.deleteCharAt(sb.length()-1);
      return sb.toString(); 
     
      
    }
}
