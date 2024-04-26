package LeetCode;

import java.util.Arrays;

public class Maximum_Number_of_Coins_You_Can_Get {

    public int maxCoins(int[] piles) 
    {

        >>>>>>>>>>>>>>>>>>>>>>>>>>>> BRUTE FORCE APPROACH <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<



        Arrays.sort(piles);

        int n = piles.length;
        int result =0;
        int alice = n-2;
        int bob = 0;

        while(alice > bob)
        {
            result += piles[alice];
            bob++;
            alice-=2;
        }

        return result;



        >>>>>>>>>>>>>>>>>>>>>>>>>>>> EFFICIENT WAY <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

          
        int n= piles.length;
        Arrays.sort(piles);
        int result =0;

        for(int i = n/3;i<n;i+=2)
        {
            result += piles[i];
        }

        return result;
        
    }
    
}
