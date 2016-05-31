package bit.ideafactory.iocworkshop;

import bit.ideafactory.iocworkshop.studentkit.Eraser;
import bit.ideafactory.iocworkshop.studentkit.Paper;
import bit.ideafactory.iocworkshop.studentkit.Writer;

import java.util.List;

/**
 * @author Michal Partyka
 */
public class Student {
    private final Eraser rubber;
    private final Writer pencil;
    private final Paper paper;

    public Student(Eraser rubber, Writer pencil, Paper paper) {
        this.rubber = rubber;
        this.pencil = pencil;
        this.paper = paper;
    }

    public void writeEssay(List<String> paragraphs) {
        paragraphs.forEach(this::writeParagraph);
//        for (String paragraph : paragraphs) {
//            this.writeParagraph(paragraph);
//        }
    }

    public Paper getPaper() {
        return paper;
    }

    private String fixParagraph(String paragraph) {
        return rubber.eraseLast(paragraph);
    }

    private void writeParagraph(String paragraph) {
        final String writtenParagraph = pencil.write(paragraph);
        paper.addParagraph(writtenParagraph);
        final String fixedParagraph = fixParagraph(writtenParagraph);
        paper.updateLastParagraph(fixedParagraph);
    }


}
