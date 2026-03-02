package medium;

import java.util.*;

public class ValidSudoku {


    public static void main(String[] args) {
        char[][] arr = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(arr));
    }


//    public static boolean isValidSudoku(char[][] board) {
//        boolean result = false;
//        int size = board.length;
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < board.length; i++) {
//            for (int j = i + 1; j < board.length; j++) {
//                map.put(Arrays.toString(board[i]), i);
//            }
//
//        }
//        System.out.println(map);
//
//        return result;
//    }


    public static boolean isValidSudoku(char[][] board) {
        // Sets to track seen numbers in rows, columns, and 3x3 sub-boxes
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];

                // Skip empty cells
                if (number == '.') {
                    continue;
                }

                // Check for duplicates in row, column, and 3x3 sub-box
                // If any add operation fails (returns false), it means a duplicate exists
                if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in submatrix " + i / 3 + "-" + j / 3)) {
                    return false; // Duplicate found, Sudoku is invalid
                }
            }
        }
        return true; // No duplicates found, Sudoku is valid
    }
}
