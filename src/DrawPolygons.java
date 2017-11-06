import javax.swing.*;
import java.awt.*;
import java.util.*;

import static java.lang.System.out;


public class DrawPolygons extends Component{
    private ArrayList<Polygon> polygons;

    public DrawPolygons(){
        polygons = new ArrayList<>();
        Triangle triangle = new Triangle(200,250);
        Rectangle rectangle = new Rectangle(250,300);
        Square square = new Square(300,350);

        polygons.add(new Triangle(100,100));
        polygons.add(new Rectangle(150,150));
        polygons.add(new Square(100,200));

        square.overlaps(triangle);
        polygons.get(1).overlaps(polygons.get(2));

    }//constructor

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < polygons.size(); i++) {
            polygons.get(i).draw(g);
        }
    }//paint

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

}//DrawPolygons