class Solution {
    public int majorityElement(int[] nums) {
        int elem = nums[0];
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                elem = nums[i];
            }
            if (nums[i] == elem) {
                count++;
            } else {
                count--;
            }
        }
        int countFinal = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == elem) {
                countFinal++;
            }
        }

        if (countFinal > n / 2) {
            return elem;
        }

        return -1;
    }
}