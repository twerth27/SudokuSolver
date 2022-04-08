package com.ui;

public class printToScreen {
    public static void printGreeting(){
        System.out.println("Welcome to the SUDOKU MASTER A.I.");
        System.out.println("Here is the puzzle I will solve!");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }

    public static void printBoard(int[][] board,int GRID_SIZE) {
        for(int row = 0; row < GRID_SIZE; row++){
            if (row % 3 == 0 && row != 0){
                System.out.println("----------------");
            }
            for(int column = 0; column < GRID_SIZE; column++){
                if (column % 3 == 0 && column != 0){
                    System.out.print(" | ");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    public static void printCompletedSuccessfully(){
        System.out.println();
        System.out.println();
        System.out.println("*************************");
        System.out.println("Solved Correctly! View the answer below");
        System.out.println("*************************");
    }
    public static void printFailedAttempt(){
        System.out.println();
        System.out.println();
        System.out.println("*************************");
        System.out.println("Unsolvable board :(");
        System.out.println("*************************");
    }

}
