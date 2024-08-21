class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int rsum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rsum += accounts[i][j];
            }
            if (rsum > result) {
                result = rsum;
            }
        }
        return result;
    }
}
