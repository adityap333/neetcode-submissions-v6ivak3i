class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mymap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer key = nums[i];
            if (mymap.containsKey(key)) {
                mymap.put(key, mymap.get(key) + 1);
            } else {
                mymap.put(key, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list =
            new ArrayList<Map.Entry<Integer, Integer>>(mymap.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}