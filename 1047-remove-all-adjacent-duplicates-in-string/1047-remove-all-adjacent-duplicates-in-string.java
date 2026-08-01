class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }
            else st.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < st.size(); i++){
            sb.append(st.get(i));
        }

        return sb.toString();
    }
}