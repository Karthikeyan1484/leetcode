class Solution {
    public boolean isValid(String s) {
        Stack<Character>ps=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='['||s.charAt(i)=='{'){
                ps.push(s.charAt(i));
            }
            else if(ps.isEmpty()){
                return false;
            }
            else if(s.charAt(i)==')'&& ps.peek()=='('||s.charAt(i)=='}'&& ps.peek()=='{'||s.charAt(i)==']'&& ps.peek()=='[')
            ps.pop();
        
            else
               return false;
    }
        if(ps.isEmpty()){
            return true;
        }
        return false;
    }
}