package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.ScientificStudent;
import bit.ideafactory.iocworkshop.students.studentkit.Writer;

public class ScientificStudentFactory {
    private final Writer writer;
    private final PaperFactory paperFactory;

    public ScientificStudentFactory(Writer writer, PaperFactory paperFactory) {
        this.writer = writer;
        this.paperFactory = paperFactory;
    }

    public ScientificStudent create() {
        return new ScientificStudent(paperFactory.create(), writer);
    }
}
