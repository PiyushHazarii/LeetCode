package LeetCode;

public class  Sum_of_Values_at_Indices_With_K_Set_Bits {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {


                 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Brute Force <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<




        int result = 0;
        for(int i=0;i<nums.size();i++)
        {
            if(isBinaryEqualsToK(i,k))
            {
                result += nums.get(i);
            }
        }
        return result;




                    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Best Method  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



    
        int result=0;
            for(int i=0; i<nums.size(); i++){
                int b = Integer.bitCount(i);               // The bitCount() is a method of Integer class under java.lang package.
                if(b == k){                                //  It returns the number of one-bits in the two's complement binary
                    result+=nums.get(i);                   //   representation of the specified int value. 
                }
            }
            return result;
    
    }
    


                >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Efficient Way <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



        boolean isBinaryEqualsToK(int num , int k )
        {
            int sum =0;
            while(num > 0)
            {
                sum += num%2;
                num /= 2;
            }
            return sum==k;
        }
    
}
