import java.util.Collections;
import java.util.Locale;
import java.util.Arrays;
import java.util.Scanner;
public class Tp7Java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //Ejercicio 1
        /*
        int [] unOrderNums = {5, 8, 18, 44, 95, 2};
        Arrays.sort(unOrderNums);
        for (int s : unOrderNums)
            System.out.println(s);
         */

        //Ejercicio 4
        /*
        double [] unOrderNums = {5.66, 8, 18, 44.44, 95, 2};
        Arrays.sort(unOrderNums);
        for (int i = unOrderNums.length -1; i >= 0; i--){
            System.out.println(unOrderNums[i]);
        }
         */
        //Ejercicio 5
        /*
        String [] strArray = {"Thomas", "Paula", "Eze", "Rodrigo", "Julieta", "Denis", "Uriel", "Zamora", "Ana", "Belén"};
        Arrays.sort(strArray);
        for(String s : strArray)
            System.out.println(s);

         */


        //Ejercicio 9
        int [] bubbleInt = {4, 7, 2, 18, 92, 25, 44, 15};
        int i, j, aux;
        for (i = 0; i < bubbleInt.length - 1; i++){
            for (j = 0; j < bubbleInt.length - 1; j++){
                if (bubbleInt[j] > bubbleInt[j+1]){
                    aux = bubbleInt[j];
                    bubbleInt[j] = bubbleInt[j+1];
                    bubbleInt[j+1] = aux;
                }
            }
        }
        for(int s : bubbleInt)
            System.out.println(s);

    }
}
