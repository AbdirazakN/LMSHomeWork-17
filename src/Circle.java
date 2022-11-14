public class Circle extends Shape{
    double radius = 7.68;
    double p = Math.PI;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + p +
                ": P = 2 * ("+p+" * "+radius+" )"+'}';
    }
    @Override
    public double getPerimeter() {
        return 2*p*radius;
    }
}
