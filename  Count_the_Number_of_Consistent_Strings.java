package LeetCode;

public class  Count_the_Number_of_Consistent_Strings {

    public int countConsistentStrings(String allowed, String[] words) 
    {

        int n = words.length;
        int count = 0;

        HashSet<Character> hs = new HashSet<>();

        for(char ch : allowed.toCharArray())
        {
            hs.add(ch);
        }

        for(String word : words)
        {
            int flag =0;
            for(char ch : word.toCharArray())
            {
                if(hs.contains(ch))
                {
                    flag = 1;
                }
                else
                {
                    flag =0;
                    break;
                }
            }
            if(flag == 1)
            {
                count++;
            }
        }

        return count;
        
    }
    
}
