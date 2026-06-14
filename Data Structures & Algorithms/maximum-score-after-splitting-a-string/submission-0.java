class Solution {
    public int maxScore(String s) {
        int maxScore = 0;

        // i represents the starting index of the right substring
        for (int i = 1; i < s.length(); i++) {
            int leftZeros = 0;
            int rightOnes = 0;

            // Count zeros in the left substring
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    leftZeros++;
                }
            }

            // Count ones in the right substring
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    rightOnes++;
                }
            }

            int currentScore = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }
}