class Rect extends Shape{
    private double height;
    private double width;

    public Rect(){
     this.height=1;
     this.width=1;
    }

    public Rect(double height,double width){
        this.height=height;
        this.width = width;
    }
  public Rect(double height,double width,boolean filled, String colour){
        this.height = height;
        this.width=width;
        this.filled=filled;
        this.colour=colour;
  }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*(height+width);
    }
    public String toString(){
        return "A rectangle with height "+ this.height + " and width " + this.width+ ", which is subclass of " + super.toString();

    }


}




