class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for(String str: s.split("")){
            if(!str.equals("]")){
                stack.push(str);
            } else{
                StringBuilder sb = new StringBuilder("");
                while(!stack.isEmpty() && !stack.peek().equals("[")){
                    sb.insert(0,stack.pop());
                }
                stack.pop();
    
                StringBuilder num = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    num.insert(0,stack.pop());
                }
                int k = Integer.parseInt(num.toString());

                String temp = sb.toString();
                for(int i=1; i<k; i++){
                    sb.append(temp);
                }
                stack.push(sb.toString());
            }
        }
        StringBuilder ans = new StringBuilder();
        for(String an : stack){
            ans.append(an);
        }
        return ans.toString();
    }
}