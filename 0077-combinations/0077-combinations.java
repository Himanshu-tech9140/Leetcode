import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(1, n, k, current, ans);

        return ans;
    }

    private void backtrack(int start, int n, int k,
                           List<Integer> current,
                           List<List<Integer>> ans) {

        // Combination complete
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Try every possible number
        for (int i = start; i <= n; i++) {
            current.add(i);

            backtrack(i + 1, n, k, current, ans);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}