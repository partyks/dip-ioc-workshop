package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.paper.LessonPaper;
import bit.ideafactory.iocworkshop.students.studentkit.writers.Pencil;
import bit.ideafactory.iocworkshop.students.FoolStudent;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class FoolStudentTest {
    @Test
    public void foolStudent_shouldWriteInOneParagraph() throws Exception {
        //given
        final List<String> pars = Arrays.asList("Par1", "Par2", "Par3");
        final FoolStudent foolStudent =
                new FoolStudent(new LessonPaper(), new Pencil());

        //when
        foolStudent.writeEssay(pars);

        //then
        final Paper paper = foolStudent.getPaper();
        assertThat(paper.toString()).isEqualTo("^Par1Par2Par3^");
    }
}