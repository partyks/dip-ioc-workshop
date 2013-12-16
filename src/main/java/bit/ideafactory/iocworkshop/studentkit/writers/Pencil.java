package bit.ideafactory.iocworkshop.studentkit.writers;

import bit.ideafactory.iocworkshop.studentkit.Writer;

/**
 * @author Michal Partyka
 */
public class Pencil extends AbstractWriter implements Writer {
    private static final Character PENCIL_SPECIAL_CHARACTER = '^';

    @Override
    public String write(String message) {
        return super.write(message, PENCIL_SPECIAL_CHARACTER);
    }
}
