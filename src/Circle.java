class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius=1;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, boolean filled, String colour){
        this.radius= radius;
        this.filled = filled;
        this.colour=colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "A circle with radius "+ this.radius + ", which is subclass of " + super.toString();

    }
}
