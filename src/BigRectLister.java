import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Object> rectangles = new ArrayList<Object>();

        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 1));
        rectangles.add(new Rectangle(6, 4));
        rectangles.add(new Rectangle(5, 5));
        rectangles.add(new Rectangle(3, 7));
        rectangles.add(new Rectangle(2, 1));
        rectangles.add(new Rectangle(4, 4));
        rectangles.add(new Rectangle(6, 8));

        rectangles = BigRectangleFilter.collectAll(rectangles, new BigRectangleFilter());

        System.out.println("Passed Rectangles");
        for (Object r : rectangles) {
            Rectangle rectangle = (Rectangle) r;
            System.out.println("Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight());
        }
    }
}
