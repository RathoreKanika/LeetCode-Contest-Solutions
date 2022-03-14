//https://leetcode.com/contest/weekly-contest-282/problems/minimum-time-to-complete-trips/

class Solution 
{
    public long minimumTime(int[] time, int totalTrips) 
    {
        Arrays.sort(time);
        long lo = 1;
        long hi = 1l * totalTrips * time[0];
        long result = hi;
        while(lo<=hi)
        {
            long mid = lo + (hi - lo) / 2;
            boolean flag = verifyTravel(time, totalTrips, mid);
            if(flag)
            {
                result = mid;
                hi = mid - 1;
            }
            else
                lo = mid + 1;
        }
        return result;
    }
    
    boolean verifyTravel(int[] time, int totalTrips, long t)
    {
        int count = 0;
        for(int i=0; i<time.length && count<totalTrips; i++)
            count+=t/time[i];
        if(count<totalTrips)
            return false;
        else
            return true;
    }
}
