import shape.Circle;
import shape.Rectangle;
import shape.Square;

public class TestResizeableInterface {
    public static void main(String[] args) {
        //test circle
        Circle circle=new Circle();
        System.out.println(circle);
        circle.resize(50);
        System.out.println(circle);
        //test rectangle
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle.resize(20);
        System.out.println(rectangle);
        //test square
        Square square=new Square();
        System.out.println(square);
        square.resize(70);
        System.out.println(square);
    }
}
