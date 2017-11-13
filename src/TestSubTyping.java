import java.util.ArrayList;
import java.util.List;

/**
 * Created by schan on 2017-11-13.
 */
public class TestSubTyping {

    Polygon[] polygons = new Polygon[10];
    Triangle[] triangles = new Triangle[10];
    List<Polygon> polygonList = new ArrayList<>(10);
    List<Triangle> triangleList = new ArrayList<>(10);
    List<? extends Polygon> polygonsList2 = new ArrayList<>(10);
    List<? super Polygon> polygonsSuper = new ArrayList<>(10);

    TestSubTyping() {
    }
}
