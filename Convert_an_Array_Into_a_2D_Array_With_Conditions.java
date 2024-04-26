package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Convert_an_Array_Into_a_2D_Array_With_Conditions {

     public List<List<Integer>> findMatrix(int[] nums) 
     {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        int count[] = new int[n+1];

        for(int i =0;i<n;i++)
        {
            if(count[nums[i]] >= result.size())          // size will be zero because o row mein add ho 
            {                                            // raha hai value to size 1 hi hoga....
                result.add(new ArrayList<>());
            }
            result.get(count[nums[i]]).add(nums[i]);     //just like array it shows the code
            count[nums[i]]++;                            // count[nums[i]].add(nums[i])..""0"" pe koi value
        }                                                // 1 pe koi value 2 pe koi value.....and so on

        return result;
        
    }
    
}
