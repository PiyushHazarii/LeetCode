package LeetCode;

public class Max_Increase_to_Keep_City_Skyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) 
    {
        int n = grid.length;
        int sum =0;

        int maxcolvalue[] = new int[n];              // question is not easy to understand just see the example
        int maxrowvalue[] = new int[n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                maxrowvalue[i] = Math.max(maxrowvalue[i],grid[i][j]);
                maxcolvalue[j] = Math.max(maxcolvalue[j],grid[i][j]);
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum += Math.min(maxrowvalue[i], maxcolvalue[j]) - grid[i][j];
            }
        }

        return sum;
        
    }
    
}
