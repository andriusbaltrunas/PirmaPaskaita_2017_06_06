package treciaPaskaita;

import java.util.Comparator;

/**
 * Created by andriusbaltrunas on 6/8/2017.
 */
public class Person{
    private String name;
    private String surname;
    private String city;
    private int age;

    public Person(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }


    public static Comparator<Person> sortByName = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Person> sorBySurname = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    };

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

}
