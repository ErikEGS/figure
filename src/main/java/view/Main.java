package view;
import model.Color;
import model.Rectangle;
import model.Square;
import model.Triangle;
import model.Triangle2;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(2,3,5,Color.YELLOW);
        square.draw();

        Rectangle rectangle = new Rectangle(3,2,8,Color.GREEN,4);
        rectangle.draw();

        Triangle triangle = new Triangle(4,4 ,7, Color.PURPLE);
        triangle.draw();

    }
}
