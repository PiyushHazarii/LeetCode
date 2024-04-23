package LeetCode;

public class Sum_of_Squares_of_Special_Elements {

    public int sumOfSquares(int[] nums) 
    {
        int n = nums.length;
        int square = 0;

        for(int i=0;i<n;i++)
        {
            if(n % (i+1) == 0)
            {
                square += nums[i] * nums[i];
            }
        }

        return square;
        
    }
    
}
