package LeetCode;

public class Minimum_Amount_of_Time_to_Collect_Garbage {

    public int garbageCollection(String[] garbage, int[] travel) 
    {
        
        int n = garbage.length;

        int time =0;

        int plen =0;
        int glen =0;
        int mlen =0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<garbage[i].length();j++)
            {
                if(garbage[i].charAt(j) == 'P')
                {
                    plen = i;
                }
                else if(garbage[i].charAt(j) == 'G')
                {
                    glen = i;
                }
                else 
                {
                    mlen =i;
                }
                time++;
            }
        }


        for(int i=1;i<travel.length;i++)
        {
            travel[i] += travel[i-1];
        }

        if(mlen > 0)
        {
            time += travel[mlen-1];
        }
         if(glen > 0)
        {
            time += travel[glen-1];
        }
         if(plen > 0)
        {
            time += travel[plen-1];
        }

        return time;
        
    }
    
}
