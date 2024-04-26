package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_the_People_Given_the_Group_Size {

    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {


        >>>>>>>>>>>>>>>>>>>>>>>>>>> BRUTE FORCE METHOD <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



        int n = groupSizes.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(groupSizes[i] > 0)
            {
                int size = groupSizes[i];
                List<Integer> temp = new ArrayList<>();
                for(int j =0;j<n && temp.size() < size;j++)
                {
                    if(groupSizes[j] == size)
                    {
                        temp.add(j);
                        groupSizes[j]= 0;
                    }
                }
                if(temp.size() > 0)
                {
                    result.add(temp);
                }
            }
        }

        return result;




         >>>>>>>>>>>>>>>>>>>>>>>>>>>ANOTHER CODE FOR EFFICIENT RESULT<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<





        int n = groupSizes.length;
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int size = groupSizes[i];
            List<Integer> temp = map.getOrDefault(size, new ArrayList<>());
            temp.add(i);
            map.put(size,temp);

            if(temp.size() == size)
            {
                result.add(temp);
                map.remove(size);
            }
        }

        return result;
        
    }
    
}
