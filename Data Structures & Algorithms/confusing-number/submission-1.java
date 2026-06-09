class Solution {
    public boolean confusingNumber(int n) {
        // 1. Keep the set immutable and only use it for lookups
        Set<Integer> validDigits = Set.of(0, 1, 6, 8, 9);
        int original = n;
        long rotatedNumber = 0; // Use long to prevent integer overflow during rotation
        while (n > 0) {
            int digit = n % 10;
            // If the digit cannot be rotated, it's not a confusing number
            if (!validDigits.contains(digit)) {
                return false;
            }
            // 2. Map the digit to its 180-degree rotated counterpart
            int rotatedDigit = digit;
            if (digit == 6)
                rotatedDigit = 9;
            else if (digit == 9)
                rotatedDigit = 6;
            // 3. Rebuild the rotated number from left to right
            rotatedNumber = (rotatedNumber * 10) + rotatedDigit;
            n = n / 10;
        }

        // 4. A confusing number must look DIFFERENT when flipped upside down
        return rotatedNumber != original;
    }
}
