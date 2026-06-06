class Solution {
    public boolean validWordSquare(List<String> words) {
        int rows = words.size();
        int cols = 0;
        for (String word : words) {
            cols = Math.max(cols, word.length());
        }

        if (rows != cols) {
            return false;
        }
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String word = words.get(i);
            for (int j = 0; j < word.length(); j++) {
                matrix[i][j] = word.charAt(j);
            }
        }
        for (int i=0;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
