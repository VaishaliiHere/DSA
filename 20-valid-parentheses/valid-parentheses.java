class Solution {
    public boolean isValid(String s) {
        char[] ch = ch = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        for (char b : ch) {

            if (b == '(' || b == '{' || b == '[') {
                stk.push(b);
                continue;
            }
            if (stk.isEmpty()) return false;

            if (b == ')') {
                if (stk.pop() != '(')   return false;
            }
            else if (b == '}') {
                if (stk.pop() != '{')   return false;
            }
            else if (b == ']') {
                if (stk.pop() != '[')   return false;
            }
        }
        return stk.isEmpty();
    }
}