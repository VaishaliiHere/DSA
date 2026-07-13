class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        for (Map.Entry<Character, Integer> entry : list) {
            int freq = entry.getValue();
            char c = entry.getKey();
            while (freq != 0) {
                res.append(c);
                freq--;
            }
        }
        return res.toString();
    }
}