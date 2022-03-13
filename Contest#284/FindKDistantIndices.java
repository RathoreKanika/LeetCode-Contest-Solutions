// https://leetcode.com/contest/weekly-contest-284/problems/find-all-k-distant-indices-in-an-array/

class Solution 
{
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) 
    {
        Set<Integer> result = new TreeSet<Integer>();
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==key)
            {
                for(int j=i-k;j<=i+k;j++)
                {
                    if(j>=0&&j<=nums.length-1)
                        result.add(j);
                }
            }
        }
        return new ArrayList(result);
    }
}
