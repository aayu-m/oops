public class Square extends Rect{

    public double side;

    public Square(){
        super(1,1);
    }
    public Square(double side) {
    super(side,side);
    }
    public Square(double side,boolean filled,String colour){
        super(side,side,filled,colour);
    }

    public  Square( boolean filled, String colour){
        super(1,1,filled,colour);
    }
    public String toString(){
        return "A square which is subclass of " + super.toString();

    }

}
