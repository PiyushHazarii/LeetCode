package LeetCode;

public class Maximum_Product_Difference_Between_Two_Pairs {

    public int maxProductDifference(int[] nums) 
    {
        Arrays.sort(nums);

        // Calculate the product difference between the largest
        // two elements and the smallest two elements

        int n = nums.length;

        int maxProduct = nums[n - 1] * nums[n - 2];
        
        int minProduct = nums[0] * nums[1];

        // Return the difference between the maximum and minimum product

        return maxProduct - minProduct;

    }
    
}
