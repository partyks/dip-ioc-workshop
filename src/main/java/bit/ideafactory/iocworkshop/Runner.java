package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Runner {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Runner.class);
    private OurClass ourClass;
    private ClassPathXmlApplicationContext context;

    public Runner() {
        context = new ClassPathXmlApplicationContext("spring-config.xml");
    }

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
        ourClass = (OurClass) context.getBean("ourClass");
    }
}
