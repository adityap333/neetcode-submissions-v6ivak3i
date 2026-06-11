class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> alpha = new HashMap<Character, Integer>();
        for (int i = 0; i < keyboard.length(); i++) {
            alpha.put(keyboard.charAt(i), i);
        }
        int sum = 0, a = 0, b = 0;
        for (int i = 0; i < word.length(); i++) {
            if (i == 0) {
                a = alpha.get(keyboard.charAt(i));
                b = alpha.get(word.charAt(i));
            } else {
                a = alpha.get(word.charAt(i));
                b = alpha.get(word.charAt(i - 1));
            }
            sum += (a > b) ? (a - b) : (b - a);
        }
        return sum;
    }
}
