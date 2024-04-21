package LeetCode;

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {

    public int differenceOfSum(int[] nums) {

        int n = nums.length;
        int elementsum = 0;
        int digitsum = 0;
       
        for(int num : nums)
        {
            elementsum += num;
        }

        for(int num : nums)
        {
            if(num > 9)
            {
            while(num != 0)
            {
                digitsum += num%10;
                num = num/10;
            }
        }


        if(num <= 9)
        {
            digitsum += num;
        }
    }
       int ans = Math.abs(digitsum - elementsum);

       if(ans < 0)
       {
        ans = ans * -1;
       }

       return ans;
       
    }
    
}
