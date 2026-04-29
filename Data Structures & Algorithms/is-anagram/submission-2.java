class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        int len1 = s.length();
        int len2 = t.length();

        if (len1 != len2)
            return false;

        for (int i = 0; i < len1; i++) {
            mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < len2; i++) {
            if (mpp.containsKey(t.charAt(i)))
            {
                mpp.put(t.charAt(i), mpp.get(t.charAt(i)) - 1);

            if (mpp.get(t.charAt(i)) == 0)
                mpp.remove(t.charAt(i));
            }

            else

            mpp.putIfAbsent(t.charAt(i), 1);    
        }

        return mpp.isEmpty();
    }
}
