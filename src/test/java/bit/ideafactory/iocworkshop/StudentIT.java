package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.studentkit.Paper;
import bit.ideafactory.iocworkshop.studentkit.erasers.Corrector;
import bit.ideafactory.iocworkshop.studentkit.erasers.Rubber;
import bit.ideafactory.iocworkshop.studentkit.paper.ExamPaper;
import bit.ideafactory.iocworkshop.studentkit.paper.LessonPaper;
import bit.ideafactory.iocworkshop.studentkit.writers.Pen;
import bit.ideafactory.iocworkshop.studentkit.writers.Pencil;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Author: Piotr Turek
 */
public class StudentIT {
    private Student instance;
    private Student examStudent;

    @Before
    public void setUp() throws Exception {
        instance = new Student(new Rubber(), new Pencil(), new LessonPaper());
        examStudent = new Student(new Corrector(), new Pen(), new ExamPaper());
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
        examStudent.writeEssay(pars);

        //then
        final Paper paper = examStudent.getPaper();
        assertThat(paper.toString()).isEqualTo("*Par**Par**Par*");
    }
}
