import java.util.Arrays;
import java.util.Scanner;
public class Tp8Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        /*
        int [][] matrizA = {{1,2,3},{1,2,3,}};
        int [][] matrizB = {{1,2,3},{1,2,3,}};


        int [][] resultado = miMetodo(matrizA,matrizB);
        System.out.println(Arrays.deepToString(resultado));


    }
    public static int[][] miMetodo(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];
        if (matrizA.length == matrizB.length) {
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            return matrizC;
        }
        return matrizC;
    }

         */



        //Ejercicio 2
        /*
        int[][] firstMatriz = {{5, 6, 8}, {9, 7, 3}};
        int[][] secondMatriz = {{5, 3}, {2,1}, {5, 8}};
        int[][] result = multMatriz(firstMatriz, secondMatriz);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++) {
                System.out.println(result[i][j] + " ");
            }
        }
    }
    public static int[][] multMatriz(int[][] m1, int[][] m2) {
    int [][] mResult = new int[2][3];
    for(int i = 0; i < 2; i++){
        int sum = 0;
        for(int j = 0; j < 2; j++) {
            for (int k = 0; k < 3; k++) {
                sum += m1[i][k] * m2[k][j];
            }
            mResult[i][j] = sum;
        }
    }
    return mResult;
    }
         */




        //Ejercicio 8
        /*
        int [][] firtsMatriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sum;
        sum = sumaFila(firtsMatriz);
    }
    public static int sumaFila(int [][] matriz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de la fila a sumar: ");
        int row;
        row = sc.nextInt();
        return row;

         */
    }
}
