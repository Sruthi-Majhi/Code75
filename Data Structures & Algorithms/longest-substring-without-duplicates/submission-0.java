class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0, l = 0;
        int n = s.length();
        Map<Character, Integer> mpp = new HashMap<>();
        int maxLength = 0;

        while(r < n)
        {
            char ch = s.charAt(r);
            while(mpp.containsKey(ch))
            {
                mpp.remove(s.charAt(l));
                l++;
            }
            mpp.put(ch, 1);

            maxLength = Math.max(maxLength, r - l + 1);
            r++;

        }
        return maxLength;
    }
}
