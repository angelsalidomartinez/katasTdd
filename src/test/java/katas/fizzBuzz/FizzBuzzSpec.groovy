package katas.fizzBuzz

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzSpec extends Specification{

    @Unroll
    void "return #outcomeExpected if I receive a value #value"(){
        given:
            FizzBuzz fizzBuzz = new FizzBuzz()
        when:
            String outcome = fizzBuzz.getFizzBuzz(value)
        then:
            outcomeExpected.equalsIgnoreCase(outcome)
        where:
            value || outcomeExpected
             3    || "Fizz"
             5    || "Buzz"
             4    || "4"
             15   || "FizzBuzz"
             6    || "Fizz"
    }
}
