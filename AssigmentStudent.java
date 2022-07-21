import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AssigmentStudent {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Abhishek","ISE","andy@gmail.com","1999-03-28",Arrays.asList(15, 25, 35, 23, 45)));
        studentList.add(new Student(1,"Ramya","MCA","ramya@gmail.com","1999-04-12",Arrays.asList(15, 25, 35, 23, 45)));
        studentList.add(new Student(1,"PAyush","ISE","ayush@gmail.com","1996-05-08",Arrays.asList(15, 25, 35, 23, 45)));
        studentList.add(new Student(1,"Sanjeevani","CSE","sanjeevani@gmail.com","1991-07-18",Arrays.asList(15, 25, 35, 23, 45)));
        Map<String,List<String>> map = new HashMap<>();
        for(Student student:studentList){
            if(!map.containsKey(student.branch)){
                map.put(student.branch,new ArrayList<>());
            }
            map.get(student.branch).add(student.name);
        }
        System.out.println("Student arranged according to branch are");
        System.out.println(map);
        System.out.println("Student age less than 25 are:");
        studentList.forEach(student -> {
            LocalDate localDate = LocalDate.parse(student.dob);
            LocalDate currentYear = LocalDate.now();
            int year = currentYear.getYear();
            if(year-localDate.getYear()<25){
                System.out.println("Name:"+student.getName());
            }
        });
        System.out.println("Student sorted by branch");
        Collections.sort(studentList,new PersonComparator());
        studentList.forEach(student -> System.out.println("Name:"+student.getName()));
        System.out.println("Student greater than age 25 and branch CSE are");
        studentList.forEach(student -> {
            LocalDate localDate = LocalDate.parse(student.dob);
            LocalDate currentYear = LocalDate.now();
            int year = currentYear.getYear();
            if(year-localDate.getYear()>25 && student.getBranch()=="CSE"){
                System.out.println("Name:"+student.getName());
            }
        });
        System.out.println("Average marks of all the students are:");
        studentList.forEach(student -> {
            System.out.println("Name:"+student.getName()+"and average marks is:"+(student.getMarks().stream().mapToInt(Integer::intValue).sum()/5));
        });

        System.out.println("Students name starting with P are:");
        studentList.forEach(student -> {
                    if(student.getName().startsWith("P")){
                        System.out.println("Name: "+student.getName());
                    }
                }
        );
        System.out.println("Student with email id as @gmail.com are:");
        Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);

        studentList.forEach(student -> {
                    Matcher matcher = pattern.matcher(student.getEmail());
                    boolean matchFound = matcher.find();
                    if(matchFound){
                        System.out.println("Name: "+student.getName());
                    }
                }
        );

    }

}

