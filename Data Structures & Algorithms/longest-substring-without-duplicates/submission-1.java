class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0, l = 0;
        int n = s.length();
        Set<Character> st = new HashSet<>();
        int maxLength = 0;

        while(r < n)
        {
            char ch = s.charAt(r);
            while(st.contains(ch))
            {
                st.remove(s.charAt(l));
                l++;
            }
            st.add(ch);

            maxLength = Math.max(maxLength, r - l + 1);
            r++;

        }
        return maxLength;
    }
}
