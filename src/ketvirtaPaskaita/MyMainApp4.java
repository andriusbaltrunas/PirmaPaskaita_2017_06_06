package ketvirtaPaskaita;

import treciaPaskaita.*;
import treciaPaskaita.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by andriusbaltrunas on 6/9/2017.
 */
public class MyMainApp4 {
    public static void main(String[] args) {
        List<Person> persons = createList();

       /*
       //anonimine klase
       Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        Collections.sort(persons, Person.sorBySurname);
        for (Person p : persons){
            System.out.println(p);
        }

    }

    private static List<Person> createList(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Petras", "Petraitis", "Kaisiadorys", 12));
        persons.add(new Person("Antanas", "Antanaitis", "Kaunas", 10));
        persons.add(new Person("Jonas", "Jonaitis", "Vilnius", 55));
        persons.add(new Person("Benas", "Benukas", "Vilnius", 23));
        persons.add(new Person("Lukas", "Lukosiavicius", "Klaipeda", 7));
        persons.add(new Person("Ona", "Paksiene", "Kaisiadorys", 27));
        persons.add(new Person("Maryte", "Petraitiene", "Pabrades", 69));
        return persons;
    }
}
