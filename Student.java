import java.util.List;

public class Student {
    public int id;
    public String name;
    public String branch;
    public String dob;
    public String email;
    List<Integer> marks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getDob() {
        return dob;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public String getEmail() {
        return email;
    }



    Student(int id, String name, String branch, String email, String dob, List<Integer> marks){
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.email = email;
        this.dob = dob;
        this.marks = marks;
    }
    public void displayStudent(Student student){
        System.out.println("ID"+student.id+", Name:"+student.name+", Email"+student.email+", Branch"+student.branch+", Date of Birth"+student.dob+", Marks"+student.marks.toString());
    }
}
