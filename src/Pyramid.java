public class Pyramid {
    private Triangle triangle;
    private double height;

    public Pyramid(Triangle triangle, double height) {
        this.triangle = triangle;
        this.height = height;
    }

    public double getVolume() {
        return (1.0/3.0) * this.triangle.getArea() * this.height;
    }

    public double getHeight() {
        return this.height;
    }
}

