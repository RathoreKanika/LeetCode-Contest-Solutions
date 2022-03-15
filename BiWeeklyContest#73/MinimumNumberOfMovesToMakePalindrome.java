//https://leetcode.com/contest/biweekly-contest-73/problems/minimum-number-of-moves-to-make-palindrome/


class Solution 
{
    public int minMovesToMakePalindrome(String s) 
    {
        int l=0;
        int r=s.length()-1;
        char[] ca = s.toCharArray();
        int result=0;
        while(l<r)
        {
            if(ca[l]==ca[r])
            {
                l++;
                r--;
            }
            else
            {
                int x = r;
                while(ca[l]!=ca[x])
                    x--;
                if(x==l)
                {
                    char t = ca[l];
                    ca[l] = ca[l+1];
                    ca[l+1] = t;
                    result++;
                    continue;
                }
                for(int i=x; i<r; i++)
                {
                    char t = ca[i];
                    ca[i] = ca[i+1];
                    ca[i+1] = t;
                    result++;
                }
                l++;
                r--;
            }
        }
        return result;
    }
}
