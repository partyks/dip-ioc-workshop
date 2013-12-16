package bit.ideafactory.iocworkshop.studentkit.paper;

/**
 * Author: Piotr Turek
 */
public class ExamPaper extends AbstractPaper {
    @Override
    public boolean canAccept(String paragraph) {
        return paragraph.endsWith("*");
    }
}
