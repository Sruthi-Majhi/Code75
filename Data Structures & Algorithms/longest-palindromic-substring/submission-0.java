class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int i = 0, maxOdd = 0, maxEven = 0;
        String ans = "", evenString = "", oddString = "";

        while (i < n) {
            int left = i;
            int right = i;
            while (left >= 0 && right < n) {
                if (s.charAt(left) != s.charAt(right))
                    break;

                if (maxOdd < right - left + 1) {
                    maxOdd = Math.max(right - left + 1, maxOdd);
                    oddString = s.substring(left, right + 1);
                }
                left--;
                right++;
            }

            int curr = i;
            int next = i + 1;

            while (curr >= 0 && next < n) {
                if (s.charAt(curr) != s.charAt(next))
                    break;

                if (maxEven < next - curr + 1) {
                    evenString = s.substring(curr, next + 1);
                    maxEven = Math.max(next - curr + 1, maxEven);
                }

                curr--;
                next++;
            }

            if (maxEven > maxOdd)
                ans = evenString;
            else
                ans = oddString;

            i++;
        }
        return ans;
    }
}
