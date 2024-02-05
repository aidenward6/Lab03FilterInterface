import java.awt.*;

public class ShortWordFilter implements filter{

    public boolean accept(Object x) {
        String w = (String) x;
        return w.length() < 5;

    }
}
