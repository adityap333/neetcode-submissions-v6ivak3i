class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int totalScore = 0;
        for (String operation : operations) {
            if (operation.equals("C")) {
                totalScore -= stack.pop();
            } else if (operation.equals("D")) {
                int newScore = stack.peek() * 2;
                stack.push(newScore);
                totalScore += newScore;
            } else if (operation.equals("+")) {
                int lastScore = stack.pop();
                int secondLastScore = stack.peek();
                stack.push(lastScore);
                int newScore = lastScore + secondLastScore;
                stack.push(newScore);
                totalScore += newScore;
            } else {
                int score = Integer.parseInt(operation);
                stack.push(score);
                totalScore += score;
            }
        }
        return totalScore;
    }
}