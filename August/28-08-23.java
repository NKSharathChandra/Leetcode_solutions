class MyStack {
    private LinkedList<Integer> q1 = new LinkedList<>();
  
    public void push(int x) {
    q1.add(x);
    int sz = q1.size();
    while (sz > 1) {
        q1.add(q1.remove());
        sz--;        
     }
    }
    
    public int pop() {
        int temp = q1.peek(); 
        q1.remove();
        return temp;         
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    
    public int top() {
        return q1.peek();
    }
}
