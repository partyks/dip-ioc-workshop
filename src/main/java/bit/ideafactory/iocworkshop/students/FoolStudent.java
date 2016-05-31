package bit.ideafactory.iocworkshop.students;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;
import bit.ideafactory.iocworkshop.students.studentkit.Writer;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class FoolStudent extends AbstractStudent {
    private final Writer writer;

    public FoolStudent(Paper paper, Writer writer) {
        super(paper);
        this.writer = writer;
    }

    @Override
    public void writeEssay(List<String> paragraphs) {
        final String oneParagraph = paragraphs.stream().collect(joining(""));
        final String writtenParagraph = writer.write(oneParagraph);
        getPaper().addParagraph(writtenParagraph);
    }
}
