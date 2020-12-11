package ru.job4j.condition;

public class ChessBoard {
    public static int wayRock(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int xAbs = Math.abs(x1 - x2);
        int yAbs = Math.abs(y1 - y2);
        if (xAbs == yAbs) {
            rsl = xAbs;
        }
        return rsl;
    }
}
