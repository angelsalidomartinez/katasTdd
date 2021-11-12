package katas.fizzBuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {


    private List<Rule> rules = new ArrayList<Rule>(Arrays.asList(new FizzBuzzRule(),new FizzRule(), new BuzzRule()));


    public String getFizzBuzz(int value){

        StringBuilder fizzBuzzMessage = new StringBuilder();

        for (Rule rule:rules) {
            fizzBuzzMessage.append(rule.applyTranslation(value));
        }

        return fizzBuzzMessage.toString();
    }
}
