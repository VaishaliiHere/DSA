class Solution {
    public int maxDepth(String s) {
        int value = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                value++;
            if (ch == ')')
                value--;

            res = Math.max(res, value);
        }
        return res;
    }
}