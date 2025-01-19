class Solution { 
    public boolean checkIfPangram(String sentence) { 
        if (sentence == null) { 
            return false; 
            } 
            Set<Character> alphabetSet = new HashSet<>(); 
            for (char c : sentence.toLowerCase().toCharArray()) {
                 if (c >= 'a' && c <= 'z') { 
                    alphabetSet.add(c);
                } 
        } 
        return alphabetSet.size() == 26;
    }
}