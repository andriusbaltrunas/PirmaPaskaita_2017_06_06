package studetns.manager.app;

import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 6/14/2017.
 */
public class MyMainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = 0;
        do {
            StringBuilder sb = new StringBuilder();
            sb.append(" ___________________________\n")
                    .append("| 1. IVESTI VARTOTOJA       |\n")
                    .append("| 0. Programos pabaiga      |\n")
                    .append("|___________________________|\n");
            System.out.println(sb.toString());
            System.out.println("IVESKITE SAVO PASIRINKIMA:");
            numb = NumberUtils.getCorrectNumber(sc);

            switch (numb){
                case 1:
                    CreateNewStudent createNewStudent = new CreateNewStudent(sc);
                    createNewStudent.createNewStudent();
                    break;
                case 0:
                    System.out.println("PROGRAMA BAIGIA DARBA");
                    break;
                default:
                    System.out.println("TOKIO MENIU PUNKTO NERA");
                    break;
            }
        }while (numb != 0);

    }
}
