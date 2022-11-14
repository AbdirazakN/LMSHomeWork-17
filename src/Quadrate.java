public class Quadrate extends Shape{
    int a = 5;
    int b = 5;
    int c = 5;
    int d = 5;

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ": P = 4 * "+a+'}';
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }
}
