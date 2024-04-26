package LeetCode;

public class Find_The_Original_Array_of_Prefix_Xor {

    public int[] findArray(int[] pref) 
    {

        int n = pref.length;
        int result[] = new int[n];
        result[0] = pref[0];

        for(int i=1;i<n;i++)
        {
            result[i] = (pref[i] ^ pref[i-1]);
        }
        
        return result;
        
    }
    
}
