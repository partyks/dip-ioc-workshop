package bit.ideafactory.iocworkshop.students.studentkit.writers;

import bit.ideafactory.iocworkshop.students.studentkit.Writer;

/**
 * @author Michal Partyka
 */
public class Pen extends AbstractWriter implements Writer {
    public static final char PEN_SPECIAL_CHARACTER = '*';

    @Override
    public String write(String message) {
        return super.write(message, PEN_SPECIAL_CHARACTER);
    }
}
