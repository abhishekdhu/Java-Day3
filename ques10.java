import java.time.LocalDate;
import java.util.List;
public class ques10 {

    public static void main(String[] args) {
        seedData seed = new seedData();
        List<Student> studentList = seed.getStudent();
        for(Student student : studentList) {
            LocalDate localDate = LocalDate.now();
            int dob_year = LocalDate.parse(student.getDob()).getYear();
            int curr_year = localDate.getYear();
            System.out.println(curr_year - dob_year);
        }
    }
}
