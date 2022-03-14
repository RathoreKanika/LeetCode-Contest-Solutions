//https://leetcode.com/contest/weekly-contest-282/problems/counting-words-with-a-given-prefix/

class Solution 
{
    public int prefixCount(String[] words, String pref) 
    {
        int count=0;
        for(String s : words)
        {
            if(s.length()>=pref.length() && s.substring(0,pref.length()).equals(pref))
                count++;
        }
        return count;
    }
}
