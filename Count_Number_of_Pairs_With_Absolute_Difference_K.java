package LeetCode;

public class Count_Number_of_Pairs_With_Absolute_Difference_K {

    public int countKDifference(int[] nums, int k) 
    {
        int n = nums.length;
        int count = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int difff = nums[i]- nums[j];
                if(difff < 0)
                {
                   difff = (difff) * -1; 
                }
                if(difff == k)
                {
                    count++;
                }
            }
        }

        return count;
        
    }

    
}
