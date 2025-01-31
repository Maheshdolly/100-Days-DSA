class Solution {
    public String sortSentence(String s) {

        String[]  words = s.split(" ");

        Map<Integer, String> map = new LinkedHashMap<>();
        for(int i=0; i<words.length; i++){
            int len = words[i].length();
            int num = Integer.parseInt(String.valueOf(words[i].charAt(len-1)));
            map.put(num ,words[i].substring(0 , len-1));
        }

        String[] res = new String[words.length];
        for(Map.Entry<Integer,String> entry : map.entrySet()){
           int index = entry.getKey() - 1; 
            res[index] = entry.getValue();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<res.length; i++){
            sb.append(res[i]);
            if( i != res.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}