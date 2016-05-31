package bit.ideafactory.iocworkshop.students.studentkit.writers;

import bit.ideafactory.iocworkshop.students.studentkit.Writer;

/**
 * @author Michal Partyka
 */
public abstract class AbstractWriter implements Writer {
    public String write(String message, Character specialCharachter) {
        return specialCharachter + message + specialCharachter;
    }
}
