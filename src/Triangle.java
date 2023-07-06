import java.security.PublicKey;

class Triangle extends Shape{

    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1,double side2, double side3){
        this.side1=side1;
        this.side2= side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double s= (side1+side3+side2)/2;
        return Math.sqrt(s*Math.abs(s-side1)*Math.abs(s-side2)*Math.abs(s-side3));
    }
    public double getPerimeter(){
        return side1+side3+side2;
    }

}
