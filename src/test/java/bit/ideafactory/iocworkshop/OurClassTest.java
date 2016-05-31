package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.FoolStudent;
import bit.ideafactory.iocworkshop.students.HumanistStudent;
import bit.ideafactory.iocworkshop.students.ScientificStudent;
import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.erasers.Corrector;
import bit.ideafactory.iocworkshop.students.studentkit.writers.Pen;
import bit.ideafactory.iocworkshop.students.studentkit.writers.Pencil;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;
import static org.fest.assertions.Assertions.assertThat;

public class OurClassTest {
    @Test
    public void class_shouldWriteEssays() throws Exception {
        //given
        final Pen pen = new Pen();
        final Corrector corrector = new Corrector();
        final Pencil pencil = new Pencil();

        final ExamPaperFactory examPaperFactory = new ExamPaperFactory();
        final LessonPaperFactory lessonPaperFactory = new LessonPaperFactory();

        FoolStudentFactory foolStudentFactory = new FoolStudentFactory(pen, lessonPaperFactory);
        HumanistStudentFactory humanistStudentFactory = new HumanistStudentFactory(
                pen, corrector, examPaperFactory
        );
        final ScientificStudentFactory scientificStudentFactory = new ScientificStudentFactory(
                pencil, lessonPaperFactory
        );
        final FoolStudent foolStudent = foolStudentFactory.create();
        final HumanistStudent humanistStudent = humanistStudentFactory.create();
        final ScientificStudent scientificStudent = scientificStudentFactory.create();

        final OurClass ourClass = new OurClass(Lists.newArrayList(
                foolStudent,
                humanistStudent,
                scientificStudent
        ));
        final List<String> pars = Arrays.asList("Par1", "Par2", "Par3");

        //when
        final Map<Student, Paper> papers = ourClass.writeEssay(pars);

        //then
        final List<String> essays = papers.values()
                .stream()
                .map(Paper::toString)
                .collect(toList());
        assertThat(essays)
                .containsOnly("*Par**Par**Par*", "*Par1Par2Par3*", "^Par1^^Par2^^Par3^");
    }
}