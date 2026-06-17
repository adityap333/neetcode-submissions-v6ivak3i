class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                filtered.append(Character.toLowerCase(ch));
            }
        }

        char mychar[] = filtered.toString().toCharArray();
        int i = 0, j = mychar.length - 1;
        while (i < j) {
            if (mychar[i] == mychar[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
