class Solution {
    public String licenseKeyFormatting(String s, int k) {

        // Step 1: Remove all dashes
        s = s.replace("-", "");

        // Step 2: Convert everything to uppercase
        s = s.toUpperCase();

        StringBuilder ans = new StringBuilder();

        // Step 3: Traverse from right to left
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (count == k) {
                ans.append('-');
                count = 0;
            }

            ans.append(s.charAt(i));
            count++;
        }

        // Step 4: Reverse because we built from right to left
        return ans.reverse().toString();
    }
}