package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.studentkit.Paper;

public abstract class AbstractStudent implements Student {
    private final Paper paper;

    public AbstractStudent(Paper paper) {
        this.paper = paper;
    }

    public Paper getPaper() {
        return paper;
    }
}
