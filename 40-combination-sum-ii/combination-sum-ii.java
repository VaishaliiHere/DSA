

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // 1. डुप्लीकेट्स से बचने के लिए सबसे पहले एरे को SORT करें
        Arrays.sort(candidates);
        
        List<Integer> currentCombination = new ArrayList<>();
        return backtrack(0, target, currentCombination, candidates);
    }

    private List<List<Integer>> backtrack(int startIndex, int target, List<Integer> li, int[] arr) {
        List<List<Integer>> localAns = new ArrayList<>();

        if (target == 0) {
            localAns.add(new ArrayList<>(li));
            return localAns;
        }

        for (int i = startIndex; i < arr.length; i++) {
            
            if (i > startIndex && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            li.add(arr[i]);
            localAns.addAll(backtrack(i + 1, target - arr[i], li, arr));
            li.remove(li.size() - 1);
        }

        return localAns;
    }
}
