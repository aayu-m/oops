abstract class Shape {

    protected boolean filled;
    protected String colour;

    public Shape(){
        this.filled = true;
        this.colour = "green";
    }

    public Shape(boolean filled, String colour){
        this.filled= filled;
        this.colour= colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColour() {
        return colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString(){
        if(isFilled()){
            return "A shape with colour "+ colour +" is " + "filled.";}
        else{
            return "A shape with colour "+ colour +" is " + "not filled.";
        }

    }
    abstract double getArea();
    abstract double getPerimeter();
}
