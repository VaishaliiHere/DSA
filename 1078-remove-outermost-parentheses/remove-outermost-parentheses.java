class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);
        int value = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '(')
                value++;
            else
                value--;

            if ((c == '(' && value == 1) || (c == ')' && value == 0)) {
                sb.setCharAt(i ,' ');
            }
        }
        return sb.toString().replaceAll(" ", "");
    }
}