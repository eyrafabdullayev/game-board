package com.example.gameboard.utils;

import com.example.gameboard.beans.Board;
import com.example.gameboard.config.Initialization;
import java.util.Scanner;

public class CompetitionUtil {

    private static Scanner sc = new Scanner(System.in);
    private static Board[][] board = null;

    static {
        board = Initialization.config.getBoard();

        if (board == null) {
            board = new Board[4][4];

            board[0][0] = new Board('A', false);
            board[0][1] = new Board('B', false);
            board[0][2] = new Board('C', false);
            board[0][3] = new Board('D', false);
            board[1][0] = new Board('E', false);
            board[1][1] = new Board('F', false);
            board[1][2] = new Board('Z', false);
            board[1][3] = new Board('X', false);
            board[2][0] = new Board('A', false);
            board[2][1] = new Board('B', false);
            board[2][2] = new Board('C', false);
            board[2][3] = new Board('X', false);
            board[3][0] = new Board('F', false);
            board[3][1] = new Board('D', false);
            board[3][2] = new Board('E', false);
            board[3][3] = new Board('Z', false);
        }
    }

    public static void showBoard() {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].isShow()) {
                    System.out.print("[ " + board[i][j].getLetter() + " ]");
                } else {
                    System.out.print("[ " + " " + " ]");
                }
            }

            System.out.println();
        }
    }

    public static void start() {
        if (gameIsDone()) {
            System.out.println("You have finished the game..");
        } else {
            showBoard();
            typeLetters();
        }
    }

    public static boolean gameIsDone() {
        int d = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!board[i][j].isShow()) {
                    d++;
                }
            }
        }

        if (d == 0) {
            return true;
        }

        return false;
    }

    public static void typeLetters() {

        System.out.println("type row and column number for first card: ");
        int i = sc.nextInt() - 1;
        int j = sc.nextInt() - 1;

        board[i][j].setShow(true);
        showBoard();

        System.out.println("type row and column for similar card: ");
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;

        if (board[x][y].getLetter() == board[i][j].getLetter()) {
            board[x][y].setShow(true);
            isSimilar();
        } else {
            board[i][j].setShow(false);
        }

        showBoard();
    }

    public static void isSimilar() {
        increaseScore();
        Initialization.config.setBoard(board);
    }

    public static void increaseScore() {
        int currenPoint = Initialization.config.getPoint();
        Initialization.config.setPoint(currenPoint + 10);
    }
    
    public static void showScore(){
        System.out.println("Your Score = "+Initialization.config.getPoint());
    }
    
    public static void exit(){
        System.out.println("Do you want to save the game(y/n): ");
        sc.nextLine();//dummy
        String check = sc.nextLine();
        if(check.equals("y")){
            Initialization.configRefresh();
        }
        System.out.println("Good bye..");
        System.exit(0);
    }
}
