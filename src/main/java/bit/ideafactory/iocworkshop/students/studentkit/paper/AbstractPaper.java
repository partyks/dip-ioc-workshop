package bit.ideafactory.iocworkshop.students.studentkit.paper;

import bit.ideafactory.iocworkshop.students.studentkit.Paper;

import java.util.LinkedList;
import java.util.List;

/**
 * Author: Piotr Turek
 */
public abstract class AbstractPaper implements Paper {
    private final List<String> paragraphs = new LinkedList<String>();

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        paragraphs.forEach(builder::append);
        return builder.toString();
    }

    @Override
    public void addParagraph(String writtenParagraph) {
//        Preconditions.checkArgument(canAccept(writtenParagraph), "Cannot accept a paragraph written this way");
        paragraphs.add(writtenParagraph);
    }

    @Override
    public void updateLastParagraph(String fixedParagraph) {
//        Preconditions.checkArgument(this.atLeastOneParagraphExistAndNewOneIsAcceptable(fixedParagraph), "Cannot accept this paragraph.");
        paragraphs.set(paragraphs.size() - 1, fixedParagraph);
    }

    private boolean atLeastOneParagraphExistAndNewOneIsAcceptable(String fixedParagraph) {
        return !paragraphs.isEmpty() && canAccept(fixedParagraph);
    }
}
