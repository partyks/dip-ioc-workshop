package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.FoolStudent;
import bit.ideafactory.iocworkshop.students.studentkit.Writer;

public class FoolStudentFactory {
    private final Writer writer;
    private final PaperFactory paperFactory;

    public FoolStudentFactory(Writer writer, PaperFactory paperFactory) {
        this.writer = writer;
        this.paperFactory = paperFactory;
    }

    public FoolStudent create() {
        return new FoolStudent(paperFactory.create(), writer);
    }
}
