class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int[] nums, boolean[] used,
                            List<Integer> current,
                            List<List<Integer>> ans) {

        // permutation complete
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // already used element
            if (used[i]) {
                continue;
            }

            // choose
            used[i] = true;
            current.add(nums[i]);

            // explore
            backtrack(nums, used, current, ans);

            // undo choice (backtracking)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}