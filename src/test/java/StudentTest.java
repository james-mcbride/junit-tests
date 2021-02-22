import org.junit.Before;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {
    public Student student;
    @Before
    public void setUp(){
        student= new Student("Jimmie", 1);
    }


    @Test
    public void testIfConstructorWorks(){
        assertNotNull(student);
    }


    @Test
    public void testName(){
        assertEquals("Jimmie", student.getName());
    }

    @Test
    public void testID(){
        assertEquals(1, student.getID(), 0);
    }

    @Test
    public void testGradesExist(){
        assertNotNull(student.getGrades());
    }

    @Test
    public void testIfGradesCanBeAdded(){
        assertEquals(0, student.getGrades().size());
        student.addGrade(97);
        assertEquals(1, student.getGrades().size());
    }

    @Test
    public void testGradeAverage(){
        student.addGrade(99);
        student.addGrade(97);
        assertEquals(98, student.getGradeAverage(), 0);
    }


}
