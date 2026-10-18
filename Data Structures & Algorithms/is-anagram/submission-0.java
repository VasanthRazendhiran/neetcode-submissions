class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> mapForS = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mapForS.put(ch, mapForS.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> mapForT = new HashMap<>();
        for (char ch : t.toCharArray()) {
            mapForT.put(ch, mapForT.getOrDefault(ch, 0) + 1);
        }
        return mapForS.equals(mapForT);
    }
}
