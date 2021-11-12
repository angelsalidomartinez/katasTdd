package katas.fizzBuzz;

public class FizzBuzzRule implements Rule{
    @Override
    public String applyTranslation(int value) {
        return value % 15 == 0?"FIZZBUZZ":"";
    }
}
