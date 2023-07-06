


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(13.222);
        Rect rectangle = new Rect(14,10, true, "pink");
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());

        Square sq1 = new Square(10);
        System.out.println(sq1.toString());

        Square sq2 = new Square(10,false,"blue");
        System.out.println(sq2.toString());

        Square sq3 = new Square(false, "brown");
        System.out.println(sq3.toString());



    }
}