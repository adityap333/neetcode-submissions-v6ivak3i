class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> myList = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].contains(words[j]) && !words[i].equals(words[j])){
                    if(!(myList.contains(words[j]))){
                        myList.add(words[j]);
                    }
                }
            }
        }
        return myList;
    }
}