class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n - 2;
        int mid = 0;
        if (n == 1)
            return 0;
        if (nums[1] < nums[0])
            return 0;
        if (nums[n - 1] > nums[n - 2])
            return n - 1;
        
        while (low <= high) {
            mid = (low + high) / 2;

            if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
                return mid;
            } else if (nums[mid + 1] < nums[mid]) {
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return -1;
    }
}