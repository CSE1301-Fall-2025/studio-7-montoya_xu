import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
    
    private double length;
    private double width;

    public Rectangle(double rLength, double rWidth){
        length = rLength;
        width = rWidth;
    }

    public void draw(){
        //TODO: create point p1 and p2 object to replace x and y?? 
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setCanvasSize(100,100);
        StdDraw.filledRectangle(50,50,0.5*this.length,0.5*this.width);
    }

    public boolean square(){
        return (this.length == this.width);
    }

    public double area (){
        return this.length * this.width;
    }

    public double perimeter(){
        return (2*this.length) + (2*this.width);
    }

    public boolean bigArea(Rectangle comparison){
        return (this.area() > comparison.area());
    }

    public String toString(){
        return this.length + " by " + this.width + " rectangle";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = new Rectangle (5,5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.area());
        System.out.println(r2.perimeter());
        System.out.println(r1.bigArea(r2));
        r1.draw();
    }

    }
