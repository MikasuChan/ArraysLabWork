import java.util.Random;

/**
 * Autor: Mi
 * Not finished, just logic
 */
public class Main {

    public static void main(String[] args){

        int N = 4, M = 4;
        int[][] array = new int[N][M];
        boolean has_no_zero;
        int iterator;

        //Здесь создается массив====================================================================
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            for (int o = 0; o < array[0].length; o++){
                array[i][o] = rnd.nextInt(2);
            }
        }
        //Печать только что созданного массива======================================================
        System.out.println("Source array:");
        for (int i = 0; i < array.length; i++){
            for (int o = 0; o < array[0].length; o++){
                System.out.print(array[i][o] + " ");
            }
            System.out.println();
        }
        //Проверить не содержит ли весь массив одни нули=============================================
        has_no_zero = false;
        for (int i = 0; i < array.length; i++){
            for (int o = 0; o < array[0].length; o++){
                if (array[i][o] != 0)
                    has_no_zero = true;
            }
        }
        if (!has_no_zero){
            System.out.println("Все элементы нули, на выходе ничего");
            return;
        }

        //Вычисление строк нулей=====================================================================
        has_no_zero = false;
        int[][] new_array = new int[N][M];
        iterator = 0;
        for (int x = 0; x < N; x++){

            for (int y = 0; y < M; y++){
                if (array[x][y] != 0)
                    has_no_zero = true;
            }

            if (has_no_zero == true)
            {
                has_no_zero = false;
                new_array[iterator] = array[x];
                iterator++;
            }

        }
        array = new int[iterator][M];
        for (int i = 0; i < iterator; i++)
            array[i] = new_array[i];

        //Вычисление стоблцов==========================!!!!!!!!!!!!!!!!!============================

        //Разворачичваю матрицу - чтобы повторить поиск строк=======================================
        new_array = new int[M][array.length];
        for (int x = 0; x < M; x++)
            for (int y = 0; y < array.length; y++)
                new_array[x][y] = array[y][x];
        array = new_array;
        //Вычисление строк нулей====================================================================

        has_no_zero = false;
        new_array = new int[array.length][array[0].length];
        iterator = 0;
        for (int x = 0; x < array.length; x++){

            for (int y = 0; y < array[0].length; y++){
                if (array[x][y] != 0)
                    has_no_zero = true;
            }

            if (has_no_zero == true)
            {
                has_no_zero = false;
                new_array[iterator] = array[x];
                iterator++;
            }

        }
        array = new int[iterator][M];
        for (int i = 0; i < iterator; i++)
            array[i] = new_array[i];

        //разворачивая массив обратно==========================================================

        new_array = new int[array[0].length][array.length];
        for (int x = 0; x < array[0].length; x++)
            for (int y = 0; y < array.length; y++)
                new_array[x][y] = array[y][x];

        //Печать измененного массива===========================================================
        System.out.println("New array: ");
        for (int i = 0; i < new_array.length; i++){
            for (int o = 0; o < new_array[0].length; o++){
                System.out.print(new_array[i][o] + " ");
            }
            System.out.println();
        }
    }
}
