import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char curr = board[row][col];

                if (curr != '.') {

                    // Row check
                    if (!seen.add(curr + " in row " + row)) return false;

                    // Column check
                    if (!seen.add(curr + " in col " + col)) return false;

                    // Box check
                    int boxRow = row / 3;
                    int boxCol = col / 3;
                    if (!seen.add(curr + " in box " + boxRow + "-" + boxCol))
                        return false;
                }
            }
        }
        return true;
    }
}
