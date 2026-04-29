class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordArray = s.split(" ");
        String trun = wordArray[wordArray.length-1];
        return trun.trim().length();
    }
}