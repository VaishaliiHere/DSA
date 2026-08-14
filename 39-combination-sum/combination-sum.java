class Solution {
    List<List<Integer>> lol = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> li = new ArrayList<>();
        int i = 0;
        int n = candidates.length;
        func(i, n, target, li, candidates);
        return lol;
    }

    public void func(int i, int n, int sum, List<Integer> li, int[] arr) {
        if (sum == 0) {
            lol.add(new ArrayList<>(li));
            return;
        }

        if (i == n || sum < 0) {
            return;
        }
        if (arr[i] <= sum) {
            li.add(arr[i]);
            func(i, n, sum - arr[i], li, arr);
            li.remove(li.size() - 1);
        }

        func(i + 1, n, sum, li, arr);
    }
}