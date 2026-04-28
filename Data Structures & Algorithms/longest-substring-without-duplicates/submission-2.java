class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0, l = 0;
        int n = s.length();
       Map<Character, Integer> mpp = new HashMap<>();
        int maxLength = 0;

        while(r < n)
        {
            char ch = s.charAt(r);
            if(mpp.containsKey(ch))
            {
              l = Math.max(mpp.get(ch) + 1, l);
            }
            mpp.put(ch, r);

            maxLength = Math.max(maxLength, r - l + 1);
            r++;

        }
        return maxLength;
    }
}
