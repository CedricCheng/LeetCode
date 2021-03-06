package org.leetcode.medium;

public class MaximumLengthOfRepeatedSubarray {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length][B.length];
        int maxLen = -1;
        for(int i = 0; i < A.length; i++)
            dp[i][0] = A[i] == B[0] ? 1 : 0;
        for(int i = 0; i < B.length; i++)
            dp[0][i] = A[0] == B[i] ? 1 : 0;
        for(int i = 1; i < A.length; i++) {
            for(int j = 1; j < B.length; j++) {
                if(A[i] != B[j])
                    dp[i][j] = 0;
                else {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if(dp[i][j] > maxLen)
                        maxLen = dp[i][j];
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
    	int[] A = { 1,2,3,2,1 }, B = { 3,2,1,4,7 };
    	System.out.println(new MaximumLengthOfRepeatedSubarray().findLength(A, B));
    }
}
