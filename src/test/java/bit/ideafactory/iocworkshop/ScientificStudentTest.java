package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.paper.LessonPaper;
import bit.ideafactory.iocworkshop.students.studentkit.writers.Pen;
import bit.ideafactory.iocworkshop.students.ScientificStudent;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class ScientificStudentTest {
    @Test
    public void scientificStudent_shouldWriteWithoutErasing() throws Exception {
        //given
        final List<String> pars = Arrays.asList("Par1", "Par2", "Par3");
        final ScientificStudent scientificStudent =
                new ScientificStudent(new LessonPaper(), new Pen());

        //when
        scientificStudent.writeEssay(pars);

        //then
        final Paper paper = scientificStudent.getPaper();
        assertThat(paper.toString()).isEqualTo("*Par1**Par2**Par3*");
    }
}