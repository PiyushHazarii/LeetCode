package LeetCode;

public class Difference_Between_Ones_and_Zeros_in_Row_and_Column {

    public int[][] onesMinusZeros(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;

        int rowcount[] = new int[n];
        int colcount[] = new int[m];

        int diff[][] = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    rowcount[i]++;
                    colcount[j]++;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int  onesRow = rowcount[i];
                int onesCol = colcount[j];
                int zeroRow = n-onesRow;
                int zeroCol = m-onesCol;

                diff[i][j] = (onesRow + onesCol) - (zeroCol + zeroRow);
            }
        }

        return diff;
        
    }
    
}
