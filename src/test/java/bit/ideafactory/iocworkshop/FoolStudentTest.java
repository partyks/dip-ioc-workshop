package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.studentkit.Paper;
import bit.ideafactory.iocworkshop.studentkit.paper.LessonPaper;
import bit.ideafactory.iocworkshop.studentkit.writers.Pencil;
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