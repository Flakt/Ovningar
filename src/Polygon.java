import java.awt.*;

/**
 * Created by schan on 2017-10-30.
 */
public abstract class Polygon {
    private Point centerPoints;

    private Polygon(Point centerPoints) {
        this.centerPoints = centerPoints;
    }

    public Polygon(int x, int y) {
        this(new Point(x,y));
}

    public Point getCenterPoints() {
        return centerPoints;
    }


    public void draw(Graphics g) {
    }
}
