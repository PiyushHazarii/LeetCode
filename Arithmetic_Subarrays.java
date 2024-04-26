package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arithmetic_Subarrays {


     public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) 
     {
       int n = l.length;
       List<Boolean> result = new ArrayList<>();

       for(int i=0;i<n;i++)
       {
            int index=0;
            int temp[] = new int [r[i] - l[i] + 1];
            for(int j=l[i] ; j<=r[i] ;j++)
            {
                temp[index++] = nums[j];
            }
            result.add(isArithmeticArray(temp));
       }

       return result;

    }
    public boolean isArithmeticArray(int temp[])
    {
        if(temp.length <= 2)
        {
            return true;
        }

        Arrays.sort(temp);
        int diff = temp[1] - temp[0];

        for(int i =1;i<temp.length;i++)
        {
            if(temp[i] - temp[i-1] != diff)
            {
                return false;
            }
        }

        return true;
        
    }
    
}
