class Solution {
    public int reverse(int x) {
        int q = x;
        int rem = 0;
        long len = 0;
        while(q != 0){
            rem = (q % 10);
            q = q / 10;
            len = len * 10 + rem;
        }

        if (len > Integer.MAX_VALUE || len < Integer.MIN_VALUE) return 0;

        return (int)len;
    }
}