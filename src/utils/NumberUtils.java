package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 6/7/2017.
 */
public class NumberUtils {

    public static int getCorrectNumber(Scanner scanner){
        int response = 0;
        while (true) {
            try {
                response = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius, pakartokite");
                scanner.nextLine();
            }
        }
        return response;
    }
}
