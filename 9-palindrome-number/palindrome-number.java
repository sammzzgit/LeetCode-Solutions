class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int rem = 0;
        int q = x;
        int len = 0;
        while(q != 0){
            rem = q % 10;
            q = q / 10;
            len = len * 10 + rem;
        }
        if(len == x) return true;
        else return false;
    }
}