class Solution {

    public String reverseWords(String s) {

        // Step 1: Convert String to char array
        char[] arr = s.toCharArray();

        // Step 2: Remove extra spaces
        int len = removeSpaces(arr);

        // Step 3: Reverse the whole string
        reverse(arr, 0, len - 1);

        // Step 4: Reverse each word
        int start = 0;
        for (int end = 0; end <= len; end++) {

            if (end == len || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        // Step 5: Convert char array back to String
        return new String(arr, 0, len);
    }

    // Reverse characters from left to right
    private void reverse(char[] arr, int left, int right) {

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Remove leading, trailing and multiple spaces
    private int removeSpaces(char[] arr) {

        int i = 0;
        int j = 0;
        int n = arr.length;

        while (i < n) {

            // Skip spaces
            while (i < n && arr[i] == ' ') {
                i++;
            }

            // Copy one word
            while (i < n && arr[i] != ' ') {
                arr[j++] = arr[i++];
            }

            // Skip spaces after the word
            while (i < n && arr[i] == ' ') {
                i++;
            }

            // Add one space if another word exists
            if (i < n) {
                arr[j++] = ' ';
            }
        }

        return j;
    }
}