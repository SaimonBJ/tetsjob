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
            if (k%n==0) {  // Если текущее число кратно n, спускаемся вниз
                i++;
            }else{  // Если текущее число не кратно n, идем вверх влево
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
                if (i%4==j%4||(i+j)%4==3){  // Диагональ перевернута
                    array[i][j] = c2;
                }else{  // Недиагональный передний ряд
                    array[i][j] = c1;
                }
                c2--;
                c1++;
            }
        }
    }

}
