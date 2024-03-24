package katas.shortestWord;

import java.util.Arrays;

public class ShortestWordKata {

    public static int findShort(String s) {
        String[] stringSplited = s.split("\\s+");
        return Arrays.stream(stringSplited)
                .map(String::length)
                .min(Integer::compareTo)
                .get();
    }

}
