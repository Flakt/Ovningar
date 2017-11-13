import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;


public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygons;

    TestSubTyping testSubTyping = new TestSubTyping();
    Object object = new Object();
    Polygon polygon = new Polygon(200,90);
    Triangle triangle = new Triangle(200,250);
    Rectangle rectangle = new Rectangle(50,50);
    Square square = new Square(100,100);


    public DrawPolygons(){
        polygons = new ArrayList<>();
        testSubTyping.polygonsSuper.add(triangle);
        moveList(testSubTyping.polygonsSuper, testSubTyping.polygonList);
    }//constructor

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygons.size(); i++) {
            polygons.get(i).draw(g);
        }
        paintAll(g,testSubTyping.polygonList);
    }//paint

    public void paintAll(Graphics g, List<? extends Polygon> polygons) {
        testSubTyping.polygonsSuper.add(triangle);
        testSubTyping.polygonsSuper.add(square);
        testSubTyping.polygonsSuper.add(rectangle);
        for (int i = 0; i < polygons.size(); i++) {
            polygons.get(i).draw(g);
        }
    }

    public void moveList(List<? extends Object> list1, List<? extends Object> list2) {
        for (int i = 0; i < list1.size(); i++) {
            list2.addAll((List)list1);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygons