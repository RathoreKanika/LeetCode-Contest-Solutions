// https://leetcode.com/contest/weekly-contest-283/problems/cells-in-a-range-on-an-excel-sheet/

class Solution 
{
    public List<String> cellsInRange(String s) 
    {
        char[] sc = s.toCharArray();
        char startAlpha = sc[0];
        int startInt = Character.getNumericValue(sc[1]);
        char endAlpha = sc[3];
        int endInt = Character.getNumericValue(sc[4]);
        List<String> result = new ArrayList<>();
        while(startAlpha<=endAlpha)
        {
            int a = startInt;
            while(a<=endInt)
            {
                String temp = new String(startAlpha+""+a);
                result.add(temp);
                a++;
            }
            startAlpha++;
        }
        return result;
    }
}
