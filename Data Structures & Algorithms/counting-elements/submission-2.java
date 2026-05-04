class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int count = 0;
        for (int num : arr) {
            if (set.contains(num + 1)) {
                count++;
            }
        }
        return count;
    }
}