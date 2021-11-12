package katas.queen

import spock.lang.Specification

class QueenSolutionSpec extends Specification{

    void "return 0 if the board is size 1x1 and we have the queen without obstacles"(){
        given:
            QueenSolution queenSolution = new QueenSolution()
        when:
            Integer attackedSquares = queenSolution.queensAttack(1,0,0,0,[])
        then:
            attackedSquares == 0
    }

    void "return 3 if the board is size 2x2 and we have the queen without obstacles placed in the 0,0 square"(){
        given:
        QueenSolution queenSolution = new QueenSolution()
        when:
        Integer attackedSquares = queenSolution.queensAttack(2,0,0,0,[])
        then:
        attackedSquares == 3
    }

    void "return 3 if the board is size 2x2 and we have the queen without obstacles in the 1,1 square"(){
        given:
        QueenSolution queenSolution = new QueenSolution()
        when:
        Integer attackedSquares = queenSolution.queensAttack(2,0,1,1,[])
        then:
        attackedSquares == 3
    }

    void "return 10 if the board is size 4x4 and we have the queen without obstacles in the 1,4 square"(){
        given:
        QueenSolution queenSolution = new QueenSolution()
        when:
        Integer attackedSquares = queenSolution.queensAttack(4,0,1,4,[])
        then:
        attackedSquares == 9
    }

}
