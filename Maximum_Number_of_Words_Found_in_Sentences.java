package LeetCode;

public class Maximum_Number_of_Words_Found_in_Sentences {

    public int mostWordsFound(String[] sentences) {


        int maxwords = 0;
        
        for(String sentence : sentences)
        {
            int length = sentence.split(" ").length;
            maxwords = Math.max(maxwords,length);
        }

        return maxwords;

    }
    
}
