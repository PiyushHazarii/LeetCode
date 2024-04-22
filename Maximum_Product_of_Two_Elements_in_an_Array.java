package LeetCode;

public class Maximum_Product_of_Two_Elements_in_an_Array {

    public int maxProduct(int[] nums) 
    {
        int n = nums.length;
        
        Arrays.sort(nums);

        int maxproduct = ( nums[n-1] - 1 ) * ( nums[n-2] - 1 );

        return maxproduct;

    }
    
}
