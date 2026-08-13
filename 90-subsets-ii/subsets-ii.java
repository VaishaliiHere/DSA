class Solution {
    List<List<Integer>> lol = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int i = 0;
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        func(nums, i , n, li);
        return lol;
    }

    public void func(int[] nums, int i, int n, List<Integer> li) {
        if (i >= n) {
            lol.add(new ArrayList<>(li));
            return;
        }

        li.add(nums[i]);
        func(nums, i + 1, n, li);
        li.remove(li.size() - 1);
        while (i + 1 < n && nums[i] == nums[i + 1]) {
            i++;
        }
        func(nums, i + 1, n, li);

    }
}