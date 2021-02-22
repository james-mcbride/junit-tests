import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {
    public Cohort cohort;
    public Student jimmie;
    @Before
    public void setUp(){
        cohort=new Cohort();
        Student jimmie = new Student(1, "Jimmie");
    }

    @Test
    public void canAddStudent() {

        assertEquals(0, cohort.getStudents().size());
        cohort.addStudent(jimmie);
        assertEquals(1, cohort.getStudents().size());
    }

    @Test
    public void getListOfStudents(){
        cohort.addStudent(jimmie);
        List<Student> students = cohort.getStudents();
        assertSame(jimmie, students.get(0));
    }

    @Test
    public void getAverageGrades(){
         Student Pippin = new Student(1,"Pippin");
        Pippin.addGrade(90);
        Pippin.addGrade(70);
         Student jessie = new Student(2,"Jessie");
        jessie.addGrade(100);
        jessie.addGrade(80);
        cohort.addStudent(Pippin);
        cohort.addStudent(jessie);
        assertEquals(85, cohort.getCohortAverage(),0);
    }
}
