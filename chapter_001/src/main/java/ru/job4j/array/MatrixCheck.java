package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean res = false;
        int count = 1;
        for (int i = 0; i < board.length-1; i++) {
            for (int j = 0; j < board.length-1; j++) {
                if ((board[i][j] == board[i][j+1] || board[i][j] == board[i+1][j]) && board[i][j] == 'X') {
                    /* for (int k = j; k >= 0; k--) {
                        if (board[i][k] == ' ') {
                            continue;
                        }
                    }
                    for (int t = i; t >= 0; t--) {
                        if (board[t][j] == ' ') {
                            continue;
                        }
                    } */
                    count++;
                }

            }
        }
        if (count == 5) {
            res = true;
        }
        return res;
    }
}
