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

    public String toString() {
        System.out.println("Square");
        return "Square";
    }

    public boolean overlaps(Square s){
        System.out.println("Square.overlaps: "+this.toString()+"   and    "+s.toString());
        return true;
    }
}
