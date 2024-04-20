package LeetCode;

public class Final_Value_of_Variable_After_Performing_Operations {

    public int finalValueAfterOperations(String[] operations) {

            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> First Method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        int n = operations.length;
        int x =0;
        for(int i=0;i<n;i++)
        { 
            if(operations[i].charAt(1)=='+')
            {
                x++;
            }
            else 
            {
                x--;
            }
        }
        return x;



                >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Second Method <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<




        for(int i=0;i<n;i++)
        {
        if(operations[i].equals("++X"))
        {
            x++;
        }
        if(operations[i] .equals( "X++"))
        {
            x++;
        }
        if(operations[i].equals("--X"))
        {
            x--;
        }
        if(operations[i].equals ("X--"))
        {
            x--;
        }
        }
        return x; 
        
    }
} 