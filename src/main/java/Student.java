import java.util.Objects;

public class Student {
    private String name;
    private int matrikelnummer;


    public String getName (){
        return name;
    }
    public int getMatrikelnummer(){
        return matrikelnummer;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setMatrikelnummer (int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", matrikelnummer=" + matrikelnummer +
                ", semestreCount=" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrikelnummer == student.matrikelnummer && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, matrikelnummer);
    }

    public Student(){

    }
    public Student (String name, int matrikelnummer, int semestreCount){
        this.matrikelnummer = matrikelnummer;
        this.name = name;

    }


}
