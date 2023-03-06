public class main {
    public static void main(String[] args) {

        Student newStudent = new Student();

        newStudent.setName("Max");
        newStudent.setMatrikelnummer(4444444);


        System.out.println(newStudent.getName());

        System.out.println(newStudent.getMatrikelnummer());
        System.out.println(newStudent.toString());

        Student Peter = new Student ("Peter", 44554444, 4);

        System.out.println(Peter.toString());

        System.out.println(Peter.equals(newStudent));
        System.out.println(Peter.hashCode());
        System.out.println(newStudent.hashCode());

        Student [] studentArr = new Student [] {Peter, newStudent};

        StudentDB firstStudentDB = new StudentDB (studentArr);




    }
}
