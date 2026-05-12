class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int suffixMax[] = new int[n];
        int prefixMax[] = new int[n];

        int minHeight = 0;
        int lmax = 0;
        int rmax = 0;
        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            if (lmax < height[i]) {
                lmax = height[i];
            }
            prefixMax[i] = lmax;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (rmax < height[i]) {
                rmax = height[i];
            }
            suffixMax[i] = rmax;
        }
        for (int i = 0; i < n; i++) {
            minHeight = Math.min(prefixMax[i], suffixMax[i]);
            int aboveWater = minHeight - height[i];
            trappedWater += aboveWater;

        }
        return trappedWater;
    }
}