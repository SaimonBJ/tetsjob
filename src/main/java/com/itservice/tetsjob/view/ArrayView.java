package com.itservice.tetsjob.view;
import com.itservice.tetsjob.controller.ArrayController;

/**
 * Class showing the result of array sorting
 *
 * @version 1.0 16.12.2021
 * @author Semen Bogun
 */
public class ArrayView {


    String[] arr1 = {"111","222","333"};
    String[] arr2 = {"222111","555222","221133"};


    public static void viewArrayResult(){
        ArrayController arrayController = new ArrayController();
//        System.out.println(Arrays.toString(arrayController.inArray(arr1, arr2)));
    }



}
