class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> resultMap = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < strs.length; i++) {
            char[] temp1 = strs[i].toCharArray();
            Arrays.sort(temp1);
            String key = String.valueOf(temp1);
            if (resultMap.containsKey(key)) {
                ArrayList<String> mylist = resultMap.get(key);
                mylist.add(strs[i]);
            } else {
                ArrayList<String> mylist = new ArrayList<String>();
                mylist.add(strs[i]);
                resultMap.put(key, mylist);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> list : resultMap.values()) {
            result.add(list);
        }
        return result;
    }
}
