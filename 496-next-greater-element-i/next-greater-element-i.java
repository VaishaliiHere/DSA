class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[nums1.length];

        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && nums2[i] >= stack.peek()) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                if (nums2[i] < stack.peek()) {
                    map.put(nums2[i], stack.peek());
                }
            } else{
                map.put(nums2[i], -1);
            }

            stack.push(nums2[i]);
        }
        int j = 0;
        for (int n : nums1) {
            ans[j++] = map.getOrDefault(n, -1);
        }
        return ans;
    }
}