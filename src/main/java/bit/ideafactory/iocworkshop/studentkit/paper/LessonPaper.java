package bit.ideafactory.iocworkshop.studentkit.paper;

/**
 * Author: Piotr Turek
 */
public class LessonPaper extends AbstractPaper {
    @Override
    public boolean canAccept(String paragraph) {
        return true;
    }
}
