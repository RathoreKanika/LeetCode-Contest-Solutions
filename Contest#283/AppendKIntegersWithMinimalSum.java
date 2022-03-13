// https://leetcode.com/contest/weekly-contest-283/problems/append-k-integers-with-minimal-sum/

class Solution 
{
    public long minimalKSum(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int i = 1;
        long sum = 0;
        int j = 0;
        while(k>0)
        {
            while(j<nums.length && i==nums[j]) 
            {
                while(j+1<nums.length && nums[j]==nums[j+1])
                    j++;
                j++; 
                i++;
            }
            sum+=i;
            k--;
            i++;
        }
        return sum;
    }
}
