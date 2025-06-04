public class Wall {
    // write code here
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }

    public Wall(){

    }

    public Wall(double width, double height){
        if(width < 0) { width = 0.0;}
        if(height < 0) { height = 0.0;}
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

}