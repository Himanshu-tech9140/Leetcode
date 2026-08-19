import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int[] candidates, int target, int start,
                            List<Integer> current,
                            List<List<Integer>> ans) {

        // Target complete
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Candidate target se bada hai
            if (candidates[i] > target) {
                continue;
            }

            // Choose
            current.add(candidates[i]);

            // Same i -> same number ko dobara use kar sakte hain
            backtrack(candidates, target - candidates[i], i, current, ans);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}