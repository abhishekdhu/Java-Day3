import java.util.Comparator;

public class PersonComparator implements Comparator<Student> {

    @Override
    public int compare(Student obj1, Student obj2) {
        return obj1.getBranch().compareTo(obj2.getBranch());
    }
}
