// https://leetcode.com/contest/weekly-contest-283/problems/replace-non-coprime-numbers-in-array/


class Solution 
{
    public List<Integer> replaceNonCoprimes(int[] nums) 
    {
        LinkedList<Integer> result = new LinkedList<>();
        result.add(nums[0]);
        for(int i=1; i<nums.length; i++)
        {
            int a = nums[i];
            while(true)
            {
                int x = result.isEmpty() ? 1 : result.getLast(); 
                int gcd = gcd(x,a);
                if(gcd!=1)
                {
                    int temp = result.removeLast();
                    a = temp * (a/gcd);
                }
                else
                    break;
            }
            result.add(a);
        }
        return result;
    }
    
    int gcd(int a, int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
