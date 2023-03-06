import java.util.Arrays;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students){  //Konstruktor
        this.students = students;
    }

    public Student [] getAllStudents(){
        return this.students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent (){
        students.length;
        return
    }


}
