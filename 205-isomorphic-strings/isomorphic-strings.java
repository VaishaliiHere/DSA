class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mp = new HashMap<>();
        if (s.length() != t.length())
            return false;

        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mp.containsKey(c)) {
                sb.setCharAt(i, mp.get(c));
            } else if (!mp.containsKey(c) && !mp.containsValue(t.charAt(i))) {
                mp.put(c, t.charAt(i));
                sb.setCharAt(i, t.charAt(i));
            } else {
                return false;
            }
        }
        return (sb.toString().equals(tb.toString()));
    }
}