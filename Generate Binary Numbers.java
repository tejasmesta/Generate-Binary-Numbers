class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
        
        Queue<String> q = new LinkedList<>();
        
        q.add("1");
        
        int count = 0;
        
        while(!q.isEmpty())
        {
            String rem = q.remove();
            
            list.add(rem);
            
            count++;
            
            if(count==N)
            {
                return list;
            }
            
            q.add(rem+"0");
            q.add(rem+"1");
        }
        
        return list;
        
        
    }
    
}

