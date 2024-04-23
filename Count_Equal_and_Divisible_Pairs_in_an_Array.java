package LeetCode;

public class Count_Equal_and_Divisible_Pairs_in_an_Array {

    public int countPairs(int[] nums, int k) 
    {
        int n = nums.length;
        int count =0;

        for(int i =0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(nums[i] == nums[j])
                {
                    if((i * j) % k == 0)
                    {
                        count++;
                    }
                }
            }
        }

        return count;
        
    }
    
}
