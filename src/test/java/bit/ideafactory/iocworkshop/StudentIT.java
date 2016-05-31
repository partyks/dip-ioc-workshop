package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.erasers.Corrector;
import bit.ideafactory.iocworkshop.students.studentkit.erasers.Rubber;
import bit.ideafactory.iocworkshop.students.studentkit.paper.ExamPaper;
import bit.ideafactory.iocworkshop.students.studentkit.paper.LessonPaper;
import bit.ideafactory.iocworkshop.students.studentkit.writers.Pen;
import bit.ideafactory.iocworkshop.students.studentkit.writers.Pencil;
import bit.ideafactory.iocworkshop.students.AbstractStudent;
import bit.ideafactory.iocworkshop.students.HumanistStudent;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Author: Piotr Turek
 */
public class StudentIT {
    private AbstractStudent instance;
    private AbstractStudent examHumanistStudent;

    @Before
    public void setUp() throws Exception {
        instance = new HumanistStudent(new Rubber(), new Pencil(), new LessonPaper());
        examHumanistStudent = new HumanistStudent(new Corrector(), new Pen(), new ExamPaper());
    }


    @Test
    public void testWriteEssay() throws Exception {
        //given
        final List<String> pars = Arrays.asList("Par1", "Par2", "Par3");

        //when
        instance.writeEssay(pars);

        //then
        final Paper paper = instance.getPaper();
        assertThat(paper.toString()).isEqualTo("^Par^^Par^^Par^");
    }

    @Test
     public void examStudentWritesEssay() throws Exception {
        //given
        final List<String> pars = Arrays.asList("Par1", "Par2", "Par3");

        //when
        examHumanistStudent.writeEssay(pars);

        //then
        final Paper paper = examHumanistStudent.getPaper();
        assertThat(paper.toString()).isEqualTo("*Par**Par**Par*");
    }
}
