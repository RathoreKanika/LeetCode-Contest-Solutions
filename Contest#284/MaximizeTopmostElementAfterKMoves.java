// https://leetcode.com/contest/weekly-contest-284/problems/maximize-the-topmost-element-after-k-moves/

class Solution 
{
    public int maximumTop(int[] nums, int k) 
    {
        int n = nums.length, max = Integer.MIN_VALUE;
        if (n == 1)
        	return k % 2 == 0 ? nums[0] : -1;
    	for (int i = 0; i <= k && i < n; i++)
    		if (i != k - 1)
    			max = Math.max(max, nums[i]);
    	return max;
    }
}
