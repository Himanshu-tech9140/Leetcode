class Solution {
    public String[] findWords(String[] words) {
        
        HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();
        
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        
        for(char ch : r1.toCharArray()) row1.add(ch);
        for(char ch : r2.toCharArray()) row2.add(ch);
        for(char ch : r3.toCharArray()) row3.add(ch);
        
        List<String> ans = new ArrayList<>();
        
        for(String word : words) {
            String s = word.toLowerCase();
            
            HashSet<Character> currentRow;
            
            if(row1.contains(s.charAt(0))) {
                currentRow = row1;
            } else if(row2.contains(s.charAt(0))) {
                currentRow = row2;
            } else {
                currentRow = row3;
            }
            
            boolean valid = true;
            
            for(char ch : s.toCharArray()) {
                if(!currentRow.contains(ch)) {
                    valid = false;
                    break;
                }
            }
            
            if(valid) {
                ans.add(word);
            }
        }
        
        return ans.toArray(new String[0]);
    }
}