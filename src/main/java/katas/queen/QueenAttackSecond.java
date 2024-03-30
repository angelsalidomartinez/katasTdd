package katas.queen;

import java.util.List;

public class QueenAttackSecond {

    public static final int QUEEN = 99;

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int verticalSquares = applyVerticalPositiveMovements(n,r_q,c_q,obstacles);

        return verticalSquares;
    }

    private static int applyVerticalPositiveMovements(int n, int rQ, int cQ, List<List<Integer>> obstacles) {
        int verticalSquares = 0;

        for (int i = rQ; i <= n; i++) {
            if(!isObstacle(obstacles,i,cQ) && !isQueen(rQ,cQ,i,cQ)){
                verticalSquares++;
            }
        }
        return verticalSquares;
    }

    private static boolean isObstacle(List<List<Integer>> obstacles, int row, int columns) {
        return (obstacles != null && !obstacles.isEmpty()) && obstacles.stream().flatMap(List::stream).allMatch(c-> c == columns);
    }

    private static boolean isQueen(int rQ, int cQ, int row, int column) {
        return rQ==row && cQ == column;
    }

}
