package katas.fizzBuzz;

public class FizzRule implements Rule {

    private static final int FIZZ_DIVIDER = 3;

    @Override
    public String applyTranslation(int value) {
        return value % FIZZ_DIVIDER == 0?"FIZZ":"";
    }
}
