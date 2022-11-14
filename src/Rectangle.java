public class Rectangle extends Shape{
    int a = 10;
    int b = 7;
    int c = 10;
    int d = 7;

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ": P = 2 * ("+a+" + "+b+" )"+'}';
    }

    @Override
    public double getPerimeter() {
        return a+b+c+d;
    }
}
