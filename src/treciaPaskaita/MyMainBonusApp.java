package treciaPaskaita;

import java.io.*;

/**
 * Created by andriusbaltrunas on 6/8/2017.
 */
public class MyMainBonusApp {
    public static void main(String[] args) {

        for (Person person : readPersonFile()){
            System.out.println(person);
        }

    }

    private static Person[] readPersonFile(){
        Person[] persons = new Person[5];

        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("zmones.txt")));
            String line = "";
            int i=0;
            while ((line = bf.readLine()) != null){
                String[] items = line.split(" ");
                persons[i++] = new Person(items[0], items[1], items[2], Integer.valueOf(items[3]));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return persons;
    }
}
