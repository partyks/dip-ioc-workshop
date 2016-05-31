package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.paper.ExamPaper;

public class ExamPaperFactory implements PaperFactory {
    @Override
    public Paper create() {
        return new ExamPaper();
    }
}
