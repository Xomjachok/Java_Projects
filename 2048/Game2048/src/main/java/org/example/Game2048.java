package org.example;
import java.util.Random;
import java.util.Scanner;

public class Game2048 {

    private static final int SIZE = 4;
    private static int[][] board = new int[SIZE][SIZE];
    private static int score = 0;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        while (true) {
            printBoard();
            System.out.println("Score: " + score);
            if (gameOver()) {
                System.out.println("Game over!");
                break;
            }
            System.out.print("Enter direction (w/s/a/d): ");
            char direction = scanner.next().charAt(0);
            move(direction);
            addNewCell();
        }
        scanner.close();
    }

    private static void init() {
        addNewCell();
        addNewCell();
    }

    private static void addNewCell() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (board[x][y] != 0);
        board[x][y] = random.nextInt(2) == 0 ? 2 : 4;
    }

    private static void move(char direction) {
        switch (direction) {
            case 'w':
                moveUp();
                break;
            case 's':
                moveDown();
                break;
            case 'a':
                moveLeft();
                break;
            case 'd':
                moveRight();
                break;
        }
    }

    private static void moveUp() {
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE - 1; i++) {
                if (board[i][j] == 0) {
                    continue;
                }
                for (int k = i + 1; k < SIZE; k++) {
                    if (board[k][j] == 0) {
                        continue;
                    }
                    if (board[i][j] == board[k][j]) {
                        board[i][j] *= 2;
                        score += board[i][j];
                        board[k][j] = 0;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE - 1; i++) {
                if (board[i][j] == 0) {
                    for (int k = i + 1; k < SIZE; k++) {
                        if (board[k][j] != 0) {
                            board[i][j] = board[k][j];
                            board[k][j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void moveDown() {
        for (int j = 0; j < SIZE; j++) {
            for (int i = SIZE - 1; i > 0; i--) {
                if (board[i][j] == 0) {
                    continue;
                }
                for (int k = i - 1; k >= 0; k--) {
                    if (board[k][j] == 0) {
                        continue;
                    }
                    if (board[i][j] == board[k][j]) {
                        board[i][j] *= 2;
                        score += board[i][j];
                        board[k][j] = 0;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int j = 0; j < SIZE; j++) {
            for (int i = SIZE - 1; i > 0; i--) {
                if (board[i][j] == 0) {
                    for (int k = i - 1; k >= 0; k--) {
                        if (board[k][j] != 0) {
                            board[i][j] = board[k][j];
                            board[k][j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void moveLeft() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - 1; j++) {
                if (board[i][j] == 0) {
                    continue;
                }
                for (int k = j + 1; k < SIZE; k++) {
                    if (board[i][k] == 0) {
                        continue;
                    }
                    if (board[i][j] == board[i][k]) {
                        board[i][j] *= 2;
                        score += board[i][j];
                        board[i][k] = 0;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - 1; j++) {
                if (board[i][j] == 0) {
                    for (int k = j + 1; k < SIZE; k++) {
                        if (board[i][k] != 0) {
                            board[i][j] = board[i][k];
                            board[i][k] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void moveRight() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = SIZE - 1; j > 0; j--) {
                if (board[i][j] == 0) {
                    continue;
                }
                for (int k = j - 1; k >= 0; k--) {
                    if (board[i][k] == 0) {
                        continue;
                    }
                    if (board[i][j] == board[i][k]) {
                        board[i][j] *= 2;
                        score += board[i][j];
                        board[i][k] = 0;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = SIZE - 1; j > 0; j--) {
                if (board[i][j] == 0) {
                    for (int k = j - 1; k >= 0; k--) {
                        if (board[i][k] != 0) {
                            board[i][j] = board[i][k];
                            board[i][k] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static boolean gameOver() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
                if (i < SIZE - 1 && board[i][j] == board[i + 1][j]) {
                    return false;
                }
                if (j < SIZE - 1 && board[i][j] == board[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void printBoard() {
        System.out.println("Score: " + score);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initBoard();
        printBoard();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String move = scanner.nextLine();
            switch (move) {
                case "w":
                    moveUp();
                    break;
                case "s":
                    moveDown();
                    break;
                case "a":
                    moveLeft();
                    break;
                case "d":
                    moveRight();
                    break;
                default:
                    System.out.println("Invalid move");
                    continue;
            }
            if (gameOver()) {
                System.out.println("Game over! Final score: " + score);
                break;
            }
            addRandomTile();
            printBoard();
        }
    }
}