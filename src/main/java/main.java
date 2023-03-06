public class main {
    public static void main(String[] args) {

        Student newStudent = new Student();

        newStudent.setName("Max");
        newStudent.setMatrikelnummer(4444444);
        newStudent.setSemestreCount(4);

        System.out.println(newStudent.getName());
        System.out.println(newStudent.getSemestreCount());
        System.out.println(newStudent.getMatrikelnummer());
        System.out.println(newStudent.toString());

        Student Peter = new Student ("Peter", 4753461, 7);

        System.out.println(Peter.getMatrikelnummer());


    }
}
