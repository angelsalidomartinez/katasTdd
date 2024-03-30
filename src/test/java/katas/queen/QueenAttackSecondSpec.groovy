package katas.queen

import spock.lang.Specification

class QueenAttackSecondSpec extends Specification{

    void "return 0 if the chessboard has 1x1 size and not obstacle"(){
        given:
        when:
        int numberOfSquares = QueenAttackSecond.queensAttack(1,0,1,1,null);
        then:
        0 == numberOfSquares
    }

    void "return 3 if the chessboard has 2x2 size and not obstacle"(){
        given:
        when:
        int numberOfSquares = QueenAttackSecond.queensAttack(2,0,1,1,null);
        then:
        1 == numberOfSquares
    }

}
