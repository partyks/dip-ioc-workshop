package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.paper.LessonPaper;

public class LessonPaperFactory implements PaperFactory {
    @Override
    public Paper create() {
        return new LessonPaper();
    }
}
