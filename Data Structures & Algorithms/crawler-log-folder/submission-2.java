class Solution {
    public int minOperations(String[] logs) {
        Stack<String> myStack = new Stack<String>();
        int result = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (!myStack.isEmpty()) {
                    myStack.pop();
                }
            } else if (logs[i].equals("./")) {
                continue;
            } else {
                myStack.push(logs[i]);
            }
        }
        while (!myStack.isEmpty()) {
            myStack.pop();
            result++;
        }
        return result;
    }
}