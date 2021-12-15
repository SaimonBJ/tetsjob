package com.itservice.tetsjob.controller;
import java.util.Arrays;
/**
 * Class sorting arrays
 *
 * @version 1.0 16.12.2021
 * @author Semen Bogun
 */
public class ArrayController {


    public  String[] inArray(String[] array1, String[] array2) {
        String [] arrayResult = Arrays.stream(array1).filter(word -> (Arrays.stream(array2).anyMatch(e -> e.indexOf(word) > -1 ))).sorted().toArray(String[]::new);
        return arrayResult;
    }
}
