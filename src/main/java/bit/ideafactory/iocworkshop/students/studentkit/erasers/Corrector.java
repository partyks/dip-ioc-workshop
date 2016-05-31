package bit.ideafactory.iocworkshop.students.studentkit.erasers;

import bit.ideafactory.iocworkshop.students.studentkit.Eraser;
import com.google.common.base.Preconditions;

/**
 * @author Michal Partyka
 */
public class Corrector extends AbstractEraser implements Eraser {
    @Override
    public String eraseLast(String message) {
        Preconditions.checkArgument(!message.endsWith("%"), "PermanentMarker cannot be erased by Corrector");
        return super.eraseLast(message);
    }
}
