class Solution {
    public int strStr(String haystack, String needle) {

// check the needle is present in the haystack and return the index of haystaxk
            if(haystack.contains(needle)){
                return haystack.indexOf(needle);
            }
        
        return -1;
    }
}