public class Triangle {

    // Class Attributes

   private double trianglesSideA;

    public Triangle(final double trianglesSideA){

        this.trianglesSideA = trianglesSideA;

    }

    public double getPerimeter(){
        double perimeter = this.trianglesSideA * 3;
        return  perimeter;
    }
    public double getArea (){
        double area = ((this.trianglesSideA * 2) / 2);
        return area;
    }



}
