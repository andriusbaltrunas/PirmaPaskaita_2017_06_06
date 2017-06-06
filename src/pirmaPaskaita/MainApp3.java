package pirmaPaskaita;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 6/6/2017.
 */
public class MainApp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        do {
            System.out.println("Iveskite skaiciu");
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("suma yra -> " + sum);
    }
}
