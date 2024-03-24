package katas.breakingRecords;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BreakingRecords {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {

        Integer maxTimes = 0;
        Integer minTimes = 0;
        Integer maxCurrent = -1;
        Integer minCurrent = -1;

        for (Integer record:scores){
            if(maxCurrent < 0 && minCurrent < 0){
                maxCurrent = record;
                minCurrent = record;
            } else {
                if(maxCurrent < record){
                    maxCurrent = record;
                    maxTimes++;
                }else {
                    if(minCurrent> record){
                        minCurrent = record;
                        minTimes++;
                    }
                }
            }
        }

        return Arrays.asList(maxTimes,minTimes);
    }

}

