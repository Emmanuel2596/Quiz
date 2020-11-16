import java.lang.Math;


public class Circle {
    // Class Attributes

   private double radius;

   public Circle(final double radius){

       this.radius = radius;
   }

    public double getRadius() {

        return this.radius;
    }

    public double getArea(){
        double area = (Math.PI * Math.pow(this.radius, 2));
        return area;

    }
    public double getPerimeter(){
        double perimeter = (2 * (Math.PI)) * this.radius;
        return perimeter;

    }

    }