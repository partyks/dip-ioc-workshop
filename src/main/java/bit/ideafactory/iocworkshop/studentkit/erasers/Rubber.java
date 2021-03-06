package bit.ideafactory.iocworkshop.studentkit.erasers;

import bit.ideafactory.iocworkshop.studentkit.Eraser;
import com.google.common.base.Preconditions;

/**
 * @author Michal Partyka
 */
public class Rubber extends AbstractEraser implements Eraser {
    @Override
    public String eraseLast(String message) {
        Preconditions.checkArgument(message.endsWith("^"), "Rubber can only erase text written with Pencil");
        return super.eraseLast(message);
    }
}
