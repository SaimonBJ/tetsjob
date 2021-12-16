package com.itservice.tetsjob.controller;
/**
 * Class create magic matrix
 *
 * @version 1.0 16.12.2021
 * @author Semen Bogun
 */
public class MagicMatrixController {

    public static void oddMagic(int n,int array[][]){
        int i = 0;
        int j = n/2;
        for (int k = 1; k <= n*n; k++) {
            array[i][j] = k;
            //If the current number is a multiple of n, go down
            if (k%n==0) {
                i++;
            //If the current number is not a multiple of n, go up to the left
            }else{
                i--;
                j++;
                if (i<0) i=n-1;
                if (j>n-1) j=0;
            }
        }
    }

    public static void doubleEvenMagic(int n,int array[][]){
        int c1=1,c2=n*n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //Diagonal reversed
                if (i%4==j%4||(i+j)%4==3){
                    array[i][j] = c2;
                //Nediagonal front row
                }else{
                    array[i][j] = c1;
                }
                c2--;
                c1++;
            }
        }
    }

}
