// https://leetcode.com/contest/biweekly-contest-73/problems/most-frequent-number-following-key-in-an-array/


class Solution 
{
    public int mostFrequent(int[] nums, int key) 
    {
        Map<Integer,Integer> target = new HashMap<>();
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]==key)
            {
                if(target.containsKey(nums[i+1]))
                    target.put(nums[i+1],target.get(nums[i+1])+1);
                else
                    target.put(nums[i+1],1);
            }
        }
        int maxfreq = Collections.max(target.values());
        int t=-1;
        for(Map.Entry<Integer,Integer> entry : target.entrySet())
        {
            if(entry.getValue()==maxfreq)
                t=entry.getKey();
        }
        return t;
    }
}
