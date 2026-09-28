class Solution {
    public int[] constructRectangle(int area) {

        for (int W = (int) Math.sqrt(area); W >= 1; W--) {

            if (area % W == 0) {
                int L = area / W;

                return new int[]{L, W};
            }
        }

        return new int[]{area, 1};
    }
}