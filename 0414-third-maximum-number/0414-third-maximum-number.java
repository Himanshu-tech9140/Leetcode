class Solution {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long n = num;

            // Ignore duplicates
            if (first != null && n == first ||
                second != null && n == second ||
                third != null && n == third) {
                continue;
            }

            // Update first maximum
            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            }
            // Update second maximum
            else if (second == null || n > second) {
                third = second;
                second = n;
            }
            // Update third maximum
            else if (third == null || n > third) {
                third = n;
            }
        }

        // If third maximum doesn't exist, return first maximum
        return third == null ? first.intValue() : third.intValue();
    }
}