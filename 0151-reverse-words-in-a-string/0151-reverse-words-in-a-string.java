class Solution {

    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0)
                break;

            // End of current word
            int j = i;

            // Move to beginning of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Add space before every word except the first
            if (ans.length() > 0) {
                ans.append(" ");
            }

            // Append current word
            ans.append(s.substring(i + 1, j + 1));
        }

        return ans.toString();
    }
}