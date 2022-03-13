// https://leetcode.com/contest/weekly-contest-284/problems/count-artifacts-that-can-be-extracted/

class Solution 
{
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) 
    {
        boolean[][] flag = new boolean[n][n];
        for(int i=0; i<dig.length; i++)
        {
            flag[dig[i][0]][dig[i][1]]=true;
        }
        int count=0;
        for(int i=0; i<artifacts.length; i++)
        {
            if(isDigged(artifacts[i],flag))
                count++;
        }
        return count;
    }
    
    boolean isDigged(int artifacts[], boolean flag[][])
    {
        for(int j=artifacts[0]; j<=artifacts[2]; j++)
        {
            for(int k=artifacts[1]; k<=artifacts[3]; k++)
            {
                    if(!flag[j][k])
                        return false;
            }
        }
        return true;
    }
}
