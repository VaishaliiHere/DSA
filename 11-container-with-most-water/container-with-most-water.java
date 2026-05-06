class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int shorter = Integer.MAX_VALUE;
        int maxWater = Integer.MIN_VALUE;
        while(i <= j){
            shorter = Math.min(height[i],height[j]);
            maxWater = Math.max(maxWater, (j-i)*shorter);
            if(height[i] > height[j]){
                j--;
            }else if(height[i] < height[j]){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return maxWater;
    }
}