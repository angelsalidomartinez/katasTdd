import spock.lang.Specification
import spock.lang.Unroll

class ExerciseInterviewSpec extends Specification{

    @Unroll
    void "return #expectedResult if the input sentence is #inputSentence"(){
        given:"creating Exercise Interview Instance"
        ExerciseInterview exerciseInterview = new ExerciseInterview()
        when:
        String processResult = exerciseInterview.isValid(inputSentence)
        then:
        expectedResult == processResult
        where:
        inputSentence       || expectedResult
        "aabbcd"            || "NO"
        "aabbccddeefghi"    || "NO"
        "aaaaabc"           || "NO"
        "abbccc"            || "NO"
        "abcdefghhgfedecba" || "YES"
        "abbc"              || "YES"
    }
}
