package LeetCode;

public class Subarrays_Distinct_Element_Sum_of_Squares_I {

    public int sumCounts(List<Integer> nums) 
    {
        int n = nums.size();
        int result =0;

        for(int i=0;i<n;i++)
        {
            Set<Integer> distinctelement = new HashSet<>();

            for(int j=i;j<n;j++)
            {
                if(!distinctelement.contains(nums.get(j)))
                {
                    distinctelement.add(nums.get(j));
                }
                result += distinctelement.size() * distinctelement.size();
            }
        }

        return result;
        
    }
    
}
