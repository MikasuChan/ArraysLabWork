import java.util.Random;

/**
 * Autor: Mi
 * Not finished, just logic
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int N = 4, M = 4;
        int[][] array = new int[N][M];
        fillArray(array, N, M);
        printArray(array, N, M);

        System.out.println(findZeroLine(array, N, M));
        System.out.println(findZeroColumn(array, N, M));


    }

    /**
     *
     * @param array
     * @param N
     * @param M
     */
    public static void fillArray(int[][] array, int N, int M){
        Random rnd = new Random();
        for (int i = 0; i < N; i++){
            for (int o = 0; o < M; o++){
                array[i][o] = rnd.nextInt(2);
            }
        }
    }

    /**
     *
     * @param array
     * @param N
     * @param M
     */
    public static void printArray(int[][] array, int N, int M){
        for (int i = 0; i < N; i++){
            for (int o = 0; o < M; o++){
                System.out.print(array[i][o] + " ");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param array
     * @param N
     * @param M
     * @return
     */
    public static String findZeroLine(int[][] array, int N, int M){
        boolean stat = false;
        String ret = "Line # ";
        for (int x = 0; x < N; x++){
            stat = false;
            for (int y = 0; y < M; y++){
                if (array[x][y] != 0)
                    stat = true;
            }
            if (stat == false){
                ret += x + " ";
            }

        }
        return ret;
    }

    /**
     *
     * @param array
     * @param N
     * @param M
     * @return
     */
    public static String findZeroColumn(int[][] array, int N, int M){
        boolean stat = false;
        String ret = "Column # ";
        for (int x = 0; x < N; x++){
            stat = false;
            for (int y = 0; y < M; y++){
                if (array[y][x] != 0)
                    stat = true;
            }
            if (stat == false){
                ret += x + " ";
            }

        }
        return ret;
    }


}
