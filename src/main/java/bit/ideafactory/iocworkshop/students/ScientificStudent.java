package bit.ideafactory.iocworkshop.students;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.Writer;

import java.util.List;

public class ScientificStudent extends AbstractStudent {
    private final Writer writer;

    public ScientificStudent(Paper paper, Writer writer) {
        super(paper);
        this.writer = writer;
    }

    @Override
    public void writeEssay(List<String> paragraphs) {
        paragraphs.forEach(this::writeParagraph);
    }

    private void writeParagraph(String paragraph) {
        final Paper paper = getPaper();
        final String writtenParagraph = writer.write(paragraph);
        paper.addParagraph(writtenParagraph);
    }

}
