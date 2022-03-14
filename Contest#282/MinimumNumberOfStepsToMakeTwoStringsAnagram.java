//https://leetcode.com/contest/weekly-contest-282/problems/minimum-number-of-steps-to-make-two-strings-anagram-ii/


class Solution 
{
    public int minSteps(String s, String t) 
    {
        int[] scount = new int[26];
        int[] tcount = new int[26];
        for(char c : s.toCharArray())
            scount[c-'a']+=1;
        for(char c : t.toCharArray())
            tcount[c-'a']+=1;
        
        int count=0;
        for(int i=0; i<scount.length; i++)
        {
            if(scount[i] != tcount[i])
                count+=Math.abs(scount[i]-tcount[i]);
        }
        return count;
    }
}
