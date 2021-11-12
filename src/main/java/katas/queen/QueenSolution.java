package katas.queen;

import java.util.List;

public class QueenSolution {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        Integer attackedSquares = 0;

        for(int row = 0;row <n; row ++){
            for (int column= 0; column <n;column++){
                if(notObstacles(row,column,obstacles) && !isTheQueen(row,column,r_q,c_q)){
                    if(r_q == row){
                        attackedSquares++;
                    }else if (c_q == column){
                        attackedSquares++;
                    }else if (isDiagonal(n,row,column,r_q,r_q)){
                        attackedSquares++;
                    }
                }
            }
        }

        return attackedSquares;
    }

    private static boolean isTheQueen(int row, int column, int r_q, int c_q) {
        return row == r_q && column == r_q;
    }

    private static boolean isDiagonal(int sizeMatrix,int row, int column, int r_q, int c_q) {
        return (r_q == c_q && row == column)
                ||(r_q + c_q == sizeMatrix-1 && row + column == sizeMatrix-1);
    }

    private static boolean notObstacles(int row, int column, List<List<Integer>> obstacles) {
        return true;
    }


}
