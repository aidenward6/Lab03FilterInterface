import java.awt.*;
import java.util.ArrayList;

public class ShortWordFilter implements filter{

    public boolean accept(Object x) {
        String w = (String) x;
        return w.length() < 5;

    }

    public static ArrayList<Object>collectAll(ArrayList<Object> objects, filter s) {
        ArrayList<Object> obj = new ArrayList<Object>();
        for (Object x : objects) {
            if (s.accept(x)) {
                obj.add(x);
            }
        }
        return obj;
    }


}
