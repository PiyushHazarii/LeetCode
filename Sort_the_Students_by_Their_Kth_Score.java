package LeetCode;

import java.util.Arrays;

public class Sort_the_Students_by_Their_Kth_Score {

    public int[][] sortTheStudents(int[][] score, int k) 
    {
        
        Arrays.sort(score, (row1 , row2 ) ->Integer.compare(row2[k],row1[k]));
        return score;
        
    }
    
}
