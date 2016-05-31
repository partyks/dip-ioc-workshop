package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;

import java.util.List;

public interface Student {
    void writeEssay(List<String> paragraphs);

    Paper getPaper();
}
