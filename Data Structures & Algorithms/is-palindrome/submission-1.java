class Solution {
    public boolean isPalindrome(String s) {
        String cpy = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i < j)
        {
            char first = cpy.charAt(i);
            char last = cpy.charAt(j);
            if(Character.isLetterOrDigit(first) && Character.isLetterOrDigit(last))
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
                 if(!Character.isLetterOrDigit(first))

                i++;

                if(!Character.isLetterOrDigit(last))
            j--;
               
            }
            
        }
        return true;
    }
}
