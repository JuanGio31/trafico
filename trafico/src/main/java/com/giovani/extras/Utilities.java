package com.giovani.extras;

public class Utilities {
    private static final String COLOR_RESET = "\033[0m";
    private static final String COLOR_RED = "\033[31m";
    private static final String COLOR_GREEN = "\033[32m";
    private static final String COLOR_YELLOW = "\033[33m";
    private static final String COLOR_BLUE = "\033[34m";
    private static final String COLOR_PURPLE = "\033[35m";
    private static final String COLOR_CYAN = "\033[36m";
    private static final String COLOR_BRIGHT_RED = "\033[91m";
    private static final String COLOR_BRIGHT_GREEN = "\033[92m";
    private static final String COLOR_BRIGHT_YELLOW = "\033[93m";

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int getRandomNumber(int max) {
        return getRandomNumber(0, max);
    }

    public static void printCharColor(char c) {
        switch (c) {
            case 'R' -> System.out.print(COLOR_RED + c + COLOR_RESET);
            case 'B' -> System.out.print(COLOR_YELLOW + c + COLOR_RESET);
            case 'G' -> System.out.print(COLOR_GREEN + c + COLOR_RESET);
            case 'C' -> System.out.println(COLOR_BLUE + c + COLOR_RESET);
            default -> System.out.print(c);
        }
    }

    public static void printStringInRed(String s) {
        System.out.println(COLOR_RED + s + COLOR_RESET);
    }

    public static void printStringInGreen(String s) {
        System.out.println(COLOR_GREEN + s + COLOR_RESET);
    }

    public static void printStringInPurple(String s) {
        System.out.print(COLOR_PURPLE + s + COLOR_RESET);
    }

    public static void printStringInCyan(String s) {
        System.out.print(COLOR_CYAN + s + COLOR_RESET);
    }

    public static String castPositionToString(Position position) {
        int x = position.getRow() + 1;
        int y = position.getColumn() + 65;
        return ((char) y) + x + "";
    }

    public static Position castStringToPosition(String position) {
        if (position.length() != 2) return null;
        if (!Character.isLetter(position.charAt(0))) return null;
        if (!Character.isDigit(position.charAt(1))) return null;
        int row = position.charAt(0) - 65;
        int column = position.charAt(1) - 1;
        if (!positionIsValid(row, column)) return null;
        return new Position(row, column);
    }

    private static boolean positionIsValid(int row, int column) {
        if (row < 0 || row > 25) return false;
        return column >= 0 && column <= 25;
    }
}
