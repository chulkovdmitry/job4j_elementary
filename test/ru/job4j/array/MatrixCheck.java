package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
            for (int cell = 0; cell < board[row].length; cell++) {
             if (board[row][cell] != 'X') {
                result = false;
                break;
             }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int ind = 0; ind < board.length; ind++) {
            rsl[ind] = board[ind][ind];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int ind = 0; ind < board.length; ind++) {
          if (board[ind][ind] == 'X') {
              if ((monoHorizontal(board, ind) || monoVertical(board, ind))) {
                  result = true;
                  break;
              }
          }
        }
        return result;
    }
}
