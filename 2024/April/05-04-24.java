class Solution {
    public String makeGood(String s) {
        int len = s.length();

        Stack<Character> goodStack = new Stack<>();

        for ( char c : s.toCharArray()){
            if ( !goodStack.isEmpty() && Math.abs(c - goodStack.peek()) == 32){
                goodStack.pop();                
            }
            else{
                goodStack.push(c);
            }
        }

        StringBuilder goodString = new StringBuilder();

        while(!goodStack.isEmpty()){
            goodString.insert(0,goodStack.pop());
        }

        return goodString.toString();
    }
}
