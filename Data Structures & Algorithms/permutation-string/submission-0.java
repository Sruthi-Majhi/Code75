class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1len = s1.length();
        int s2len = s2.length();
        int [] hashs1 = new int [26];
        int [] hashs2 = new int [26];
        if(s1len >  s2len) return false;

        for(int i = 0; i < s1len; i++)
        {
            hashs1[s1.charAt(i) - 'a']++;
            hashs2[s2.charAt(i) - 'a']++;
        }

        int left = 0, right = s1len;
        while(right < s2len)
        {
            if(Arrays.equals(hashs1, hashs2))
            return true;

            hashs2[s2.charAt(left) - 'a']--;
            hashs2[s2.charAt(right) - 'a']++;
            left++;
            right++;
        }

        return (Arrays.equals(hashs1, hashs2));

    }
}
