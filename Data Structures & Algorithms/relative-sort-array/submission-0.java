class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(arr1);
        int[] result = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            int count = frequencyMap.get(num);
            while (count > 0) {
                result[index] = num;
                index++;
                count--;
            }
            frequencyMap.remove(num);
        }
        for (int num : arr1) {
            if (frequencyMap.containsKey(num)) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}