public class Main {
    public static void main(String[] args) {

        Student newStudent = new Student();

        newStudent.setName("Max");
        newStudent.setMatrikelnummer(444444);
        newStudent.setSemestreCount(4);

        System.out.println(newStudent.getName());
        System.out.println(newStudent.getSemestreCount());
        System.out.println(newStudent.getMatrikelnummer());


    }
}
