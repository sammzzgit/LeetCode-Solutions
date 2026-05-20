class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
    
    int[] C = new int[A.length];
    Set<Integer> seenA = new HashSet<>();
    Set<Integer> seenB = new HashSet<>();
    int freq = 0;

    for (int i = 0; i < A.length; i++) {
        seenA.add(A[i]);
        seenB.add(B[i]);

        if (A[i] == B[i]) {
            freq += 1;              // same element added to both
        } else {
            if (seenB.contains(A[i])) freq += 1; // A[i] seen in B before
            if (seenA.contains(B[i])) freq += 1; // B[i] seen in A before
        }

        C[i] = freq; // always carry forward the count
    }
    return C;
}
}