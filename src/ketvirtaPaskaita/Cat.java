package ketvirtaPaskaita;

/**
 * Created by andriusbaltrunas on 6/9/2017.
 */
public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private String kind;

    public Cat(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (getAge() != cat.getAge()) return false;
        if (getName() != null ? !getName().equals(cat.getName()) : cat.getName() != null) return false;
        return !(getKind() != null ? !getKind().equals(cat.getKind()) : cat.getKind() != null);

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (getKind() != null ? getKind().hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kind='" + kind + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return name.compareTo(o.getName());
    }
}
