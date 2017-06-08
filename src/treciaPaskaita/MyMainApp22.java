package treciaPaskaita;

import java.io.*;

/**
 * Created by andriusbaltrunas on 6/8/2017.
 */
public class MyMainApp22 {
    public static void main(String[] args) {

        try {
            File file = new File("vardai.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            String line= "";
            while ((line = bf.readLine()) !=null){
                System.out.println(line);
            }
            // galime ir vienoje eiluteje
            //BufferedReader bf = new BufferedReader(new FileReader(new File("vardai.txt")));
        } catch (IOException e) {
            System.out.println("Nepavyko nuskaityti failo");
        }
    }
}
