package LeetCode;

public class Minimum_Operations_to_Exceed_Threshold_Value_I {

    public int minOperations(int[] nums, int k) {



                >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Brute Force <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        int n = nums.length;
        int count=0;
        Arrays.sort(nums);

        for(int i=0 ;i<n;i++)
        {
            if(nums[i] == k)
            {
                break;
            }
            count++;
        }

        return count;



        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Efficient Way <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(list.get(i) >=k)
            {
               return count;
            }
            count++;
        }

        return count;


        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Best Way <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


         int c=0;
        for(int i: nums)
        {   if(i<k)
                c++;
        }

        return c;

    }
    
}
