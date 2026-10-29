class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String signature = new String(chars);
            map.putIfAbsent(signature,new ArrayList<>());
            map.get(signature).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
