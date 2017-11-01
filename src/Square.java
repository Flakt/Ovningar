import java.awt.*;

/**
 * Created by schan on 2017-10-30.
 */
public class Square extends Polygon {

    public Square(int x, int y) {
        super(x,y);
    }

    public void draw(Graphics g) {
        g.drawRect(getCenterPoints().x -10, getCenterPoints().y -10, 20, 20);
    }

}
