import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> generateParenthesis(int n) {
        return backtrack(0, 0, "", n);
    }

    private List<String> backtrack(int open, int close, String current, int n) {
        List<String> localAns = new ArrayList<>();

        if (current.length() == n * 2) {
            localAns.add(current);
            return localAns;
        }

        if (open < n) {
            localAns.addAll(backtrack(open + 1, close, current + "(", n));
        }
        if (close < open) {
            localAns.addAll(backtrack(open, close + 1, current + ")", n));
        }

        return localAns;
    }
}
