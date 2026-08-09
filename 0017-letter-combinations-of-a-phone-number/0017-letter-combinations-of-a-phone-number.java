import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;

        Map<Character, String> phone = new HashMap<>();
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");

        backtrack(0, new StringBuilder(), digits, phone, result);
        return result;
    }

    private void backtrack(int index, StringBuilder current, String digits,
                           Map<Character, String> phone, List<String> result) {

        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phone.get(digits.charAt(index));
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(index + 1, current, digits, phone, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
