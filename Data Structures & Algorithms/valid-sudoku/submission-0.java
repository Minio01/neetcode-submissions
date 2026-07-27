class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (!set.add(board[i][j])) return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                if (!set.add(board[j][i])) return false;
            }
        }
        
        for (int c = 0; c < 3; c++) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (i % 3 == 0) set = new HashSet<>();

                for (int j = 0 + (3 * c); j < 3 * (c + 1); j++) {
                    if (board[i][j] == '.') continue;
                    if (!set.add(board[i][j])) return false;
                }
            }
        }

        return true;
    }
}
