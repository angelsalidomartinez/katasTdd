package katas.fizzBuzz;

public class BuzzRule implements Rule {


    public static final int BUZZ_DIVIDER = 5;

    @Override
    public String applyTranslation(int value) {
        return value % BUZZ_DIVIDER == 0 ?"BUZZ":"";
    }
}
