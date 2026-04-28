class Solution {
    public boolean isPalindrome(String s) {
        String cpy = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i < j)
        {
            char first = cpy.charAt(i);
            char last = cpy.charAt(j);
            if(((first >= 65 && first <= 90) || (first >= 97 && first <= 122) ||
            (first >= 48 && first <= 57)) && ((last >= 65 && last <= 90) || (last >= 97 && last <= 122) ||
            (last >= 48 && last <= 57)))
            {
            if(last != first)
            return false;
            else
            {
                i++;
                j--;
            }
            }
            else
            {
                 if(!((first >= 65 && first <= 90) || (first >= 97 && first <= 122) ||
            (first >= 48 && first <= 57)) )

                i++;

                if(!((last >= 65 && last <= 90) || (last >= 97 && last <= 122) ||
            (last >= 48 && last <= 57)))
            j--;
               
            }
            
        }
        return true;
    }
}
