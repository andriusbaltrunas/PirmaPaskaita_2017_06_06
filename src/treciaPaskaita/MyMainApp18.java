package treciaPaskaita;

import java.util.Arrays;

/**
 * Created by andriusbaltrunas on 6/8/2017.
 */
public class MyMainApp18 {
    public static void main(String[] args) {
            int[] firstMas = {84, 3, 5, 6,1, 83};
        System.out.println(Arrays.toString(firstMas));
        System.out.println(Arrays.toString(reverseMas(firstMas)));
    }

    private static int[] reverseMas(int[] mas){
        int[] reversed = new int[mas.length];

        for(int i =0; i < mas.length; i++){
            reversed[mas.length -1 -i] = mas[i];
        }
        return reversed;
    }
}
