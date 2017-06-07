package antraPaskaita;

import utils.NumberUtils;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PrimitiveIterator;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 6/7/2017.
 */
public class MyMainApp8 {

    public static  void main(String[] args){
        System.out.println("Iveskite  masyvo ilgi");
        Scanner scanner = new Scanner(System.in);
        int masLength = NumberUtils.getCorrectNumber(scanner);

        int[] mas = new int[masLength];

        int index = 1;
        for (int i = 0; i < mas.length; i++){
            System.out.println("Iveskite " + index++ + " skaiciu");
            mas[i] = NumberUtils.getCorrectNumber(scanner);
        }
        printNumbers(mas);
    }

    private static void printNumbers(int[] mas){
        for(Integer numb : mas){
            if (numb > 100){
                System.out.println(numb);
            }
        }
    }
}
