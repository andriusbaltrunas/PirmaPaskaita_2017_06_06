package pirmaPaskaita;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 6/6/2017.
 */
public class MainApp1 {

    public static final String NELYGINIS = "Nelyginis";

    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu:");
        Scanner sc = new Scanner(System.in);
        try {
            int val = sc.nextInt();

            isThisNumberEven(val);
            /*if (val % 2 == 0) {
                System.out.println("Lyginins");
            } else {
                System.out.println("Nelyginis");
            }*/
        }catch (InputMismatchException e){
            System.out.println("juk sakiau skaiciu!");
        }
    }

    private static void isThisNumberEven(int number){
        String message = NELYGINIS;
        if (number % 2 == 0){
            message = "Lyginis";
        }
        System.out.println(message);
    }
}
