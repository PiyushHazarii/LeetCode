package LeetCode;

public class Maximum_Sum_With_Exactly_K_Elements  {

    public int maximizeSum(int[] nums, int k) 
    {
        int n = nums.length;
        int sum =0;

        Arrays.sort(nums);

        int a = nums[n-1];

        while(k != 0)
        {
            sum += a;
            a++;
            k--;
        }

        return sum;
        
    }
    
}
