package LeetCode;

import java.util.LinkedList;

public class Queries_on_a_Permutation_With_Key {

    public int[] processQueries(int[] queries, int m) 
    {
        int n = queries.length;
        int result[] = new int[n];

        LinkedList<Integer> list = new LinkedList<>();

        int count=0;

        for(int i=1;i<=m;i++)
        {
            list.add(i);
        }

        for(int i : queries)
        {
            int index = list.indexOf(i);
            int indexelement = list.get(index);

            list.remove(index);
            list.addFirst(indexelement);

            result[count] = index;
            count++;
        }
        
        return result;
        
    }
    
}
