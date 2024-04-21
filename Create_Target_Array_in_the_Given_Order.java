package LeetCode;

public class Create_Target_Array_in_the_Given_Order {

    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> target = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            target.add(index[i], nums[i]);
        }

        int result[] = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            result[i] = target.get(i);
        } 

        return result;
        
    }
    
}
