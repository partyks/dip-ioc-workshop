package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.FoolStudent;
import bit.ideafactory.iocworkshop.students.HumanistStudent;
import bit.ideafactory.iocworkshop.students.ScientificStudent;
import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.erasers.Corrector;
import bit.ideafactory.iocworkshop.students.studentkit.writers.Pen;
import bit.ideafactory.iocworkshop.students.studentkit.writers.Pencil;
import com.google.common.collect.Lists;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Runner {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Runner.class);
    private OurClass ourClass;

    public static void main(String[] args) {
        final Runner runner = new Runner();
        runner.init();
        runner.writeExam();
    }

    private void writeExam() {
        final List<String> pars = Arrays.asList("Par1", "Par2", "Par3");
        final Map<Student, Paper> papers = ourClass.writeEssay(pars);
        papers.forEach(
                (s, p) -> LOG.info("Student {}, has written {}", s.getClass().getSimpleName(), p.toString())
        );
    }

    private void init() {
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

        ourClass = new OurClass(Lists.newArrayList(
                foolStudent,
                humanistStudent,
                scientificStudent
        ));
    }
}
