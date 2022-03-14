//https://leetcode.com/contest/biweekly-contest-73/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/

class Solution 
{
    public List<List<Integer>> getAncestors(int n, int[][] edges) 
    {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<edges.length; i++)
        {
            if(!map.containsKey(edges[i][1]))
                map.put(edges[i][1], new ArrayList<Integer>());
            map.get(edges[i][1]).add(edges[i][0]);
            
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(i))
            {
                Set<Integer> parent = new TreeSet<>();
                callAns(map.get(i), map, parent);
                ans.add(new ArrayList<>(parent));
            }
            else
                ans.add(new ArrayList<>());
            
        }
        return ans;
    }
    
    void callAns(List<Integer> child, Map<Integer,ArrayList<Integer>> map, Set<Integer> parent)
    {
        for(int i=0; i<child.size(); i++)
        {
            if(parent.add(child.get(i)) && map.containsKey(child.get(i)))
                callAns(map.get(child.get(i)), map, parent);
        }
    }
}
