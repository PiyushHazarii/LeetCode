package LeetCode;

public class Minimum_Number_of_Operations_to_Move_All_Balls {

    public int[] minOperations(String boxes) 
    {

        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> BRUTE FORCE METHOD <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        int n = boxes.length();
        char ch[] = boxes.toCharArray();

        int ans[] = new int[n];

        for(int i=0;i<n;i++)
        {
            int count =0;                    
            for(int j=0;j<n;j++)
            {
                if(i != j && ch[j] == '1')
                {
                    count += Math.abs(i-j);
                }
            }
            ans[i] = count;
        }

        return ans;



        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> EFFICIENT METHOD <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



        int ans[] = new int[n];
        int left[] = new int[n];

        int count=ch[0]-'0';

        for(int i=1;i<n;i++)                    
        {
            left[i] = left[i-1] + count;
            count += ch[i] - '0';                  
        }

        count = ch[n-1] -'0';
        int right[] = new int[n];
        
        for(int i=n-2;i>=0;i--)
        {
            right[i] = right[i+1] + count;
            count += ch[i]-'0';
        }

        for(int i =0;i<n;i++)
        {
            ans[i] = left[i] + right[i];
        }

        return ans;
        
    }
    
}
