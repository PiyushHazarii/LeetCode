package LeetCode;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {

    public int[] smallerNumbersThanCurrent(int[] nums) {


        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Brute Force <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<




        int n =nums.length;
        int count[] = new int[102];

        for(int i : nums)
        {
            count[i]++;
        }

        for(int i=1;i<count.length;i++)
        {
            count[i] += count[i-1];
        }

        int result[] = new int[n];

        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                result[i]=0;
            }
            else
            {
                result[i] = count[nums[i]-1];
            }
        }
        
        return result;



        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Efficient Way <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



        int n = nums.length;
        int count[] = new int[101];

        for(int i : nums)
        {
            count[i]++;
        }

        for(int i=1;i<count.length;i++)
        {
            count[i] += count[i-1];
        }

        int result[] = new int [n];

        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
            result[i] = count[nums[i]-1];
            }
        }

        return result;

    }
    
}
