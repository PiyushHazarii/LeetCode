package LeetCode;

public class Rearrange_Array_Elements_by_Sign {

    public int[] rearrangeArray(int[] nums) 
    {
        int n = nums.length;
        int result[] = new int[n];

        int positive =0;
        int negative =1;

        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0)
            {
                result[positive] = nums[i];
                positive += 2;
            }
            else
            {
                result[negative] = nums[i];
                negative += 2;
            }
        }

        return result;
        
    }
    
}
