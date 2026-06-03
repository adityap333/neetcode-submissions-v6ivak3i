class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> mymap = new HashMap<Character, Integer>();
        char[] textArr = text.toCharArray();
        for (int i = 0; i < textArr.length; i++) {
            if (mymap.containsKey(textArr[i])) {
                int keyCount = mymap.get(textArr[i]);
                keyCount += 1;
                mymap.put(textArr[i], keyCount);
            } else {
                mymap.put(textArr[i], 1);
            }
        }

        char bol[] = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        int count = 0;
        int loopcount = text.length()-1 / 7;
        while (loopcount > 0) {
            for (int i = 0; i < bol.length; i++) {
                if (mymap.containsKey(bol[i])) {
                    int keyCount = mymap.get(bol[i]);
                    if (keyCount > 0) {
                        keyCount -= 1;
                        mymap.put(bol[i], keyCount);
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                if(i == bol.length-1){
                    count++;
                }
            }
            loopcount -= 7;
        }
        return count;
    }
}