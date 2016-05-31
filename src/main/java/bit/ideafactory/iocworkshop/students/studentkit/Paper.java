package bit.ideafactory.iocworkshop.students.studentkit;

/**
 * Author: Piotr Turek
 */
public interface Paper {
    void addParagraph(String writtenParagraph);

    void updateLastParagraph(String fixedParagraph);

    boolean canAccept(String paragraph);
}
