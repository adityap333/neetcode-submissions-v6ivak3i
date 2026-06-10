class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] mapping = new int[n];
        // value -> stack of indices where this value appears in nums2
        Map<Integer, Stack<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            int value = nums2[i];
            if (!map.containsKey(value)) {
                map.put(value, new Stack<>());
            }
            map.get(value).push(i);
        }
        // For each nums1 element, pop one matching index from nums2
        for (int j = 0; j < nums1.length; j++) {
            mapping[j] = map.get(nums1[j]).pop();
        }
        return mapping;
    }
}