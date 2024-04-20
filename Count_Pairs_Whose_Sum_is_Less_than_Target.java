package LeetCode;

public class Count_Pairs_Whose_Sum_is_Less_than_Target {

    public int countPairs(List<Integer> nums, int target) {


        int count = 0;
        int n = nums.size();

        for(int i=0; i<n ;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if( nums.get(i)+ nums.get(j) < target)
                {
                    count++;
                }
            }
        }

        return count;

    }
}
