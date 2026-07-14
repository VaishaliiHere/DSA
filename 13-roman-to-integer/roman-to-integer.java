class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        mp.put('X', 10);

        int res = mp.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i>=0 ; i--) {
            int curr = mp.get(s.charAt(i));
            int prev = mp.get(s.charAt(i+1));

            if (curr < prev)
                res -= curr;
            else
                res += curr;
        }
        return res;
    }
}