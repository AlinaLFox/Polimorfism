import shape.*;

public class Main {
    public static void main(String[] args) {

        Square square = new Square();
        square.render();
        Colour colour = Colour.BLUE;


        Circle circle = new Circle();
        circle.render();
        Colour colour2 = Colour.GREEN;


        Polygon polygon = new Polygon();
        polygon.render();
        Colour colour3 = Colour.PINK;


        Shape shape = new Square();
//        shape.render(); zapustitsea daje esli ne propisati v main etu stroku

        Shape shape2 = new Circle();
//        shape2.render();

        Shape shape3 = new Polygon();
//        shape3.render();

        System.out.println(square.render() + " " + colour.name());
        System.out.println(circle.render() + " " + colour2.name());
        System.out.println(polygon.render() + " " + colour3.name());
        System.out.println(shape.render());
        System.out.println(shape2.render());
        System.out.println(shape3.render());
    }
}