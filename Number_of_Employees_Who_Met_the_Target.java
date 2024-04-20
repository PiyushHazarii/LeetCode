package LeetCode;

public class Number_of_Employees_Who_Met_the_Target {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {


        int n = hours.length;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(hours[i] >= target)
            {
                count++;
            }
        }

        return count;
        
    }
}
