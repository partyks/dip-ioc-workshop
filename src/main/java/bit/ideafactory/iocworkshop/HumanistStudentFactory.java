package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.HumanistStudent;
import bit.ideafactory.iocworkshop.students.studentkit.Eraser;
import bit.ideafactory.iocworkshop.students.studentkit.Writer;

public class HumanistStudentFactory {
    private final Writer writer;
    private final Eraser eraser;
    private final PaperFactory paperFactory;

    public HumanistStudentFactory(Writer writer, Eraser eraser, PaperFactory paperFactory) {
        this.writer = writer;
        this.eraser = eraser;
        this.paperFactory = paperFactory;
    }

    public HumanistStudent create() {
        return new HumanistStudent(eraser, writer, paperFactory.create());
    }
}
