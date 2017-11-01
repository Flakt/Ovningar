import java.awt.*;

/**
 * Created by schan on 2017-10-30.
 */
public class Rectangle extends Polygon {

    public Rectangle(int x, int y) {
        super(x,y);
    }

    public void draw(Graphics g) {
        g.drawRect(getCenterPoints().x -20, getCenterPoints().y -10, 40, 20);
    }
}
