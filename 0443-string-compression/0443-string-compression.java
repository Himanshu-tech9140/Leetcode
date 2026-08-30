class Solution {
    public int compress(char[] chars) {

        int write = 0;
        int read = 0;

        while (read < chars.length) {

            char current = chars[read];
            int count = 0;

            // Count consecutive same characters
            while (read < chars.length && chars[read] == current) {
                count++;
                read++;
            }

            // Write the character
            chars[write++] = current;

            // Write count if greater than 1
            if (count > 1) {
                String countStr = String.valueOf(count);

                for (int i = 0; i < countStr.length(); i++) {
                    chars[write++] = countStr.charAt(i);
                }
            }
        }

        return write;
    }
}