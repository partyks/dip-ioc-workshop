package bit.ideafactory.iocworkshop.students;

import bit.ideafactory.iocworkshop.Student;
import bit.ideafactory.iocworkshop.students.studentkit.Paper;

public abstract class AbstractStudent implements Student {
    private final Paper paper;

    public AbstractStudent(Paper paper) {
        this.paper = paper;
    }

    @Override
    public Paper getPaper() {
        return paper;
    }
}
