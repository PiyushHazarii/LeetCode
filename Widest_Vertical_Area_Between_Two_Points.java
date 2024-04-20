package LeetCode;

public class Widest_Vertical_Area_Between_Two_Points {

    public int maxWidthOfVerticalArea(int[][] points) {


            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Brute Force <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



           int n = points.length;
            int temporary[] = new int [n];
            for(int i=0;i<n;i++)
            {
               temporary[i] = points[i][0];
            }
    
            Arrays.sort(temporary);
            
            int result = 0;
            for(int i=1;i<n;i++)
            {
                result = Math.max(result, temporary[i]-temporary[i-1]);
            }
            return result;



            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Efficient Way <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


            
    
            int n = points.length;
            int temp[] = new int[n];
            for(int i=0;i<n;i++)
            {
                temp[i] = points[i][0];
            }
    
    
            Arrays.sort(temp);
    
            int result = 0;
            for(int i=1;i<n;i++)
            {
                result = Math.max(result, temp[i]-temp[i-1]);
            }
            return result;
            
        }
    
}
