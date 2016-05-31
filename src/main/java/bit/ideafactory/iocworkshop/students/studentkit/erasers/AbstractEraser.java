package bit.ideafactory.iocworkshop.students.studentkit.erasers;

import bit.ideafactory.iocworkshop.students.studentkit.Eraser;

/**
 * @author Michal Partyka
 */
public abstract class AbstractEraser implements Eraser {
    @Override
    public String eraseLast(String message) {
        return message.substring(0,message.length()-2) + message.charAt(message.length()-1);
    }
}
