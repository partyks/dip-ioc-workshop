package bit.ideafactory.iocworkshop.students;

import bit.ideafactory.iocworkshop.students.studentkit.Eraser;
import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.Writer;

import java.util.List;

/**
 * @author Michal Partyka
 */
public class HumanistStudent extends AbstractStudent {
    private final Eraser eraser;
    private final Writer writer;

    public HumanistStudent(Eraser eraser, Writer writer, Paper paper) {
        super(paper);
        this.eraser = eraser;
        this.writer = writer;
    }

    @Override
    public void writeEssay(List<String> paragraphs) {
        paragraphs.forEach(this::writeParagraph);
    }

    private String fixParagraph(String paragraph) {
        return eraser.eraseLast(paragraph);
    }

    private void writeParagraph(String paragraph) {
        final Paper paper = getPaper();
        doWriteParagraph(paragraph, paper);
    }

    private void doWriteParagraph(String paragraph, Paper paper) {
        final String writtenParagraph = writer.write(paragraph);
        paper.addParagraph(writtenParagraph);
        final String fixedParagraph = fixParagraph(writtenParagraph);
        paper.updateLastParagraph(fixedParagraph);
    }


}
