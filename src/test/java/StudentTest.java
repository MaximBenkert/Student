import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void testEquals() {
        //given
       Student student1 = new Student ("Ben", 4546456, 7);
       Student student2 = new Student ("Ben", 4546456, 7);
       //when
        boolean actual = student1.equals(student2);
        //then
        assertEquals (true, actual);


    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
        //given
        Student student1 = new Student ();
        Student student2 = new Student ();
        //when
        boolean actual = student1.hashCode() == student2.hashCode();
        //the
        assertEquals (true, actual);
    }
}