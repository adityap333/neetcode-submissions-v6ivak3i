class Solution {
    public boolean confusingNumber(int n) {
        // Your array map: handles validation (-1) and rotation simultaneously
        int[] map = {0, 1, -1, -1, -1, -1, 9, -1, 8, 6};
        int original = n;
        long rotatedNumber = 0; // Protects against integer overflow during rotation
        while (n > 0) {
            int digit = n % 10;
            // Your validation logic
            if (map[digit] == -1) {
                return false;
            }
            // Your transformation logic
            int rotatedDigit = map[digit];
            // Append the rotated digit to build the final inverted number
            rotatedNumber = (rotatedNumber * 10) + rotatedDigit;
            n = n / 10;
        }
        // A confusing number must look different when flipped upside down
        return rotatedNumber != original;
    }
}
