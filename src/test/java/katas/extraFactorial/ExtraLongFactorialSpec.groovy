package katas.extraFactorial

import spock.lang.Specification
import spock.lang.Unroll

class ExtraLongFactorialSpec extends Specification{

    @Unroll
    void "return #expectedOutcome if the number to calculate the factorial #is input"(){
        given:
        when:
         BigInteger factorial = ExtraLongFactorial.calculateFactorial(input)
        then:
         expectedOutcome == factorial?.toString()
        where:
          input || expectedOutcome
            1   ||        "1"
            2   ||        "2"
            3   ||        "6"
            25  || "15511210043330985984000000"
    }


}
