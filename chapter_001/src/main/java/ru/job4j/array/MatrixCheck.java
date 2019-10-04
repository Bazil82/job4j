package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean res = false;
        int row = 0;
        int cell = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 'X') {
                        row++;
                    }
                    if (board[j][i] == 'X') {
                        cell++;
                    }
                }
                if (row == board.length || cell == board.length) {
                    res = true;
                    break;
                }
            }
        }
        return res;
    }
}

