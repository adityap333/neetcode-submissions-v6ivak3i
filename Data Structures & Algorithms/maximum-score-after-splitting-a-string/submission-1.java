class Solution {
    public int maxScore(String s) {
        // Step 1: Count total ones in the string
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                totalOnes++;
            }
        }
        int leftZeros = 0;
        int rightOnes = totalOnes;
        int maxScore = 0;
        // Step 2: Try every valid split point
        for (int i = 0; i < s.length() - 1; i++) {
            // Move s.charAt(i) into the left substring
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }
            int currentScore = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, currentScore);
        }
        return maxScore;
    }
}