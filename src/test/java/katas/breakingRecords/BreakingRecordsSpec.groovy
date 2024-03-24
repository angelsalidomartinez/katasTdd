package katas.breakingRecords

import spock.lang.Specification

class BreakingRecordsSpec extends Specification{

    void "return max times 0 and min times 0 when we have only one element in the score"(){
        given:
        List<Integer> scores= Arrays.asList(10)
        List<Integer> outcomeMaxAndMin = null;
        when:
        outcomeMaxAndMin = BreakingRecords.breakingRecords(scores)
        then:
        0 == outcomeMaxAndMin?.get(0)
        0 == outcomeMaxAndMin?.get(1)
    }

    void "return max times 1 and min times 1 when we have the following records in these two matches (10,2)"(){
        given:
        List<Integer> scores= Arrays.asList(10,2)
        List<Integer> outcomeMaxAndMin = null;
        when:
        outcomeMaxAndMin = BreakingRecords.breakingRecords(scores)
        then:
        0 == outcomeMaxAndMin?.get(0)
        1 == outcomeMaxAndMin?.get(1)
    }

    void "return 3 times max record has been broken and 0 times min if the list of scores is (0,5,20,2,1,21)"(){
        given:
        List<Integer> scores= Arrays.asList(0,5,20,2,1,21)
        List<Integer> outcomeMaxAndMin = null;
        when:
        outcomeMaxAndMin = BreakingRecords.breakingRecords(scores)
        then:
        3 == outcomeMaxAndMin?.get(0)
        0 == outcomeMaxAndMin?.get(1)
    }

    void "return 2 times max record has been broken and 4 times min if the list of scores is (10 5 20 20 4 5 2 25 1)"(){
        given:
        List<Integer> scores= Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1)
        List<Integer> outcomeMaxAndMin = null;
        when:
        outcomeMaxAndMin = BreakingRecords.breakingRecords(scores)
        then:
        2 == outcomeMaxAndMin?.get(0)
        4 == outcomeMaxAndMin?.get(1)
    }

    void "return 4 times max record has been broken and 0 times min if the list of scores is (3 4 21 36 10 28 35 5 24 42)"(){
        given:
        List<Integer> scores= Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)
        List<Integer> outcomeMaxAndMin = null;
        when:
        outcomeMaxAndMin = BreakingRecords.breakingRecords(scores)
        then:
        4 == outcomeMaxAndMin?.get(0)
        0 == outcomeMaxAndMin?.get(1)
    }

}
