package com.itservice.tetsjob.view;
import com.itservice.tetsjob.controller.ArrayController;

import java.util.Arrays;

/**
 * Class showing the result of array sorting
 *
 * @version 1.0 16.12.2021
 * @author Semen Bogun
 */
public class ArrayView {


    public static void viewArrayResult(String[] arr1, String[] arr2){
        ArrayController arrayController = new ArrayController();
        System.out.println(Arrays.toString(arrayController.inArray(arr1, arr2)));
    }



}
