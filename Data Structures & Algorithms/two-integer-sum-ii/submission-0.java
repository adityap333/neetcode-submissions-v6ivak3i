class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            myMap.put(numbers[i], target - numbers[i]);
        }
        boolean found = false;
        int tmp = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (myMap.containsKey(target - numbers[i]) && !found) {
                found = true;
                result[0] = i + 1;
                tmp = target - numbers[i];
            }
            if (found && numbers[i] == tmp) {
                result[1] = i + 1;
            }
        }
        return result;
    }
}
