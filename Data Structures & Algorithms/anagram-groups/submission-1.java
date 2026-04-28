class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);

            mpp.putIfAbsent(key, new ArrayList<>());
            mpp.get(key).add(s);
        }

        for (String lt : mpp.keySet()) {
            ans.add(mpp.get(lt));
        }
        return ans;
    }
}
