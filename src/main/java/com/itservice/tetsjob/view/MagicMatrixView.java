package com.itservice.tetsjob.view;
import java.util.Scanner;
import static com.itservice.tetsjob.controller.MagicMatrixController.doubleEvenMagic;
import static com.itservice.tetsjob.controller.MagicMatrixController.oddMagic;
/**
 * Class showing the magic matrix
 *
 * @version 1.0 16.12.2021
 * @author Semen Bogun
 */
public class MagicMatrixView {

    public static void viewMagicMatrix(){
        System.out.println("Пожалуйста, выберите порядок вывода магического квадрата:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][n];
        //Odd
        if (n%2!=0){
            oddMagic(n,array);
        //Even
        }else if (n%4!=0){
            return;
        //Double even
        }else{
            doubleEvenMagic(n,array);
        }
        printSquare(array);
    }


    public static void printSquare(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
    }
}
