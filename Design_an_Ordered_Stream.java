package LeetCode;

public class Design_an_Ordered_Stream {

    int ptr;
    String[] res;

    public OrderedStream(int n) 
    {
        ptr =0;
        res = new String[n];
    }
        
        public List<String> insert(int idKey, String value) 
        {
            ArrayList<String> list = new ArrayList<>();
            res[idKey-1] = value;

            while(ptr < res.length && res[ptr] != null)
            {
                list.add(res[ptr]);
                ptr++;
            }

            return list;
            
        }

}
