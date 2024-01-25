class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int [][] dp=new int[text1.length()+1][text2.length()+1];
        int i=0,j=0;

        for (i=0;i<text1.length();i++)
            {
                for (j=0;j<text2.length();j++)
            {
                if(text1.charAt(i)==text2.charAt(j))
                {
                    dp[i+1][j+1]=1+dp[i][j];
                }
                else
                {
                    dp[i+1][j+1]=Math.max(dp[i][j + 1],dp[i + 1][j]);

                }
            }
            }
     return dp[i][j];
    }
}
