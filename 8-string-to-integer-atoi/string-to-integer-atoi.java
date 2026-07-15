class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        long res = 0;
        s = s.trim();
        if(s.length() ==0) return 0;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if(s.charAt(i) == '+'){
            i++;
        }
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch > '9' || ch < '0') {
                break;
            }
            res = (10 * res + (ch - '0'));
            if (sign == 1 && res > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -res < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }

        return (int)res * sign;
    }
}