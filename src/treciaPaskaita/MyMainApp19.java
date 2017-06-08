package treciaPaskaita;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 6/8/2017.
 */
public class MyMainApp19 {
    public static void main(String[] args) {
        System.out.println("Iveskite zodi ar sakini");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Iveskite raide pagal kuria skaiciuosime");
        char letter = sc.nextLine().charAt(0);
        countLetters(word, letter);
    }

    private static void countLetters(String word, char letter){
        int count = 0;
        for (int i =0; i< word.length(); i++){
            if (word.charAt(i) == letter){
                count++;
            }
        }
        System.out.println(" radom " + count + letter+ " raidziu");
    }
}
