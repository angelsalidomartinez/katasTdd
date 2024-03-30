package katas.lexicographicalOrder

import spock.lang.Specification

class LexicographicalOrderSpec extends Specification{

    void "return NO_ANSWER if there is no other string that we can create"(){
        given:
        when:
        String outcome = LexicographicalOrder.biggerIsGreater("aa")
        then:
        "NO_ANSWER".equalsIgnoreCase(outcome)
    }

    void "return ba if the word that we receive is ab"(){
        when:
        String outcome = LexicographicalOrder.biggerIsGreater("ab")
        then:
        "ba".equalsIgnoreCase(outcome)
    }

}
