class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s : strs)
        {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();

    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < str.length())
        {
            while(str.charAt(j) != '#')
            {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + len;
            ans.add(str.substring(i, j));
            i = j;
        }
        return ans;

    }
}
