class Solution {
    public int scoreOfString(String s) {
        char arr[] = s.toCharArray();
        int total = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            int absDiff = (diff < 0) ? -diff : diff;
            total = total + absDiff;
        }
        return total;
    }
}