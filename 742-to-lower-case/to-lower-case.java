class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
            {
               sb.append(Character.toLowerCase(c));
            }
            else sb.append(c);
        }
        return sb.toString();
    }
}